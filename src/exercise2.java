import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class exercise2 {
    public static void printUniqueEvenNumbers(List<Integer> nums) {
        Set<Integer> uniqueEvenNumbers = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                uniqueEvenNumbers.add(num);
            }
        }
        for (Integer num : uniqueEvenNumbers) {
            System.out.println(num);
        }
    }
}
