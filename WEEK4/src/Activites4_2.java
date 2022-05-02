import java.util.ArrayList;
import java.util.Collections;

public class Activites4_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        Collections.shuffle(arr);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
