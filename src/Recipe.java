import java.util.Objects;
import java.util.Set;

public class Recipe {

    private Set<Products> productsSet;
    private double productsCost;
    private final String recipeTitle;

    public Recipe(Set<Products> productsSet, String recipeTitle) {
        if (productsSet.size() == 0 || recipeTitle == null) {
            throw new IllegalArgumentException("Не заполнены поля");
        } else {
            this.productsSet = productsSet;
            setProductsCost(productsSet);
            this.recipeTitle = recipeTitle;
        }

    }

    public Set<Products> getProductsSet() {
        return productsSet;
    }

    public void setProductsSet(Set<Products> productsSet) {
        this.productsSet = productsSet;
    }

    public double getProductsCost() {
        return productsCost;
    }

    public void setProductsCost(Set<Products> productsSet) {
        double sum = 0;
        for (Products product : productsSet) {
            sum += product.getPrice();
        }
        this.productsCost = sum;
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipeTitle, recipe.recipeTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeTitle);
    }
}
