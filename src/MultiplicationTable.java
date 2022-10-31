import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiplicationTable {


    private Set<Task> task = new HashSet<>();

    public MultiplicationTable() {
        while (task.size() < 15) {
            task.add( new Task(getRandomNumberInRange(2, 9), getRandomNumberInRange(2, 9)));
        }
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    @Override
    public String toString() {
        return "MultiplicationTable{" +
                "task=" + task +
                '}';
    }
}
