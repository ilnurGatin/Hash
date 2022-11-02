import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class TaskTwo {
    public static void numbersForTask() {
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

