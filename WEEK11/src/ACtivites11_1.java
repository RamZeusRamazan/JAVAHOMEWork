import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ACtivites11_1 {
    public static void main(String[] args) {

        Set<String> set1 = new LinkedHashSet<>(Arrays.asList(
                "George", "Jim", "John", "Blake", "Kevin", "Michael"));
        Set<String> set2 = new LinkedHashSet<>(Arrays.asList(
                "George", "Katie", "Kevin", "Michelle", "Ryan"));
        // Display the union of the two sets
        Set<String> union = new LinkedHashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of the set1 and set2 is: \n" + union);

        // Display the difference of the two sets
        Set<String> difference1 = new LinkedHashSet<>(set1);
        difference1.removeAll(set2);
        Set<String> difference2 = new LinkedHashSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("Difference of the set1 and set2 is: \n" + difference1+difference2);

        // Display the intersetion of the two sets
        Set<String> intersection = new LinkedHashSet<>();
        for (String e: set2) {
            if (set1.contains(e)){
                intersection.add(e);
            }
        }
        System.out.println("Intersection of the set1 and set2 is: \n" + intersection);
    }
}
