import java.util.HashSet;
import java.util.Set;

public class RecipeList {

    private Set<Recipe> recipes = new HashSet<>();

    public void addRecipe(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже в списке");
        } else {
            recipes.add(recipe);
        }
    }
}
