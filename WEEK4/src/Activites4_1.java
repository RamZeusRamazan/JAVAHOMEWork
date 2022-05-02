//Task13_2
import java.util.ArrayList;
import java.util.Collections;

public class Activites4_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        System.out.println(arr);
        Collections.shuffle(arr);
        System.out.println("Array is shuffled");
        System.out.println(arr);
    }
}

