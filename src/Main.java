import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Products banana = new Products("Банан", 100, 2);
        Products orange = new Products("Апельсин", 120, 3.5);
        Products kiwi = new Products("Киви", 150, 0.5);

        ProductList productList = new ProductList();
        productList.addProduct(banana);
        productList.addProduct(orange);
        productList.addProduct(kiwi);

//        productList.addProduct(banana);

        productList.removeProduct(banana);

        Recipe smuzi = new Recipe(Set.of(banana, orange, kiwi), "Smuzi");
        Recipe juice = new Recipe(Set.of(orange), "Juice");

        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(smuzi);
        recipeList.addRecipe(juice);

        //Task 2
        numbersForTask();

        // Task 3.2

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);

    }

    private static void numbersForTask() {
        Set<Integer> numbers= new HashSet<>();
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
