import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Задание 1: Нечетные числа");
        exercise1.printOddNumbers(nums1);

        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Задание 2: Четные числа без повторений в порядке возрастания");
        exercise2.printUniqueEvenNumbers(nums2);

        List<String> words1 = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        System.out.println("Задание 3: Уникальные слова");
        exercise3.printUniqueWords(words1);

        List<String> words2 = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        System.out.println("Задание 4: Количество дублей для каждого уникального слова");
        exercise4.printWordDuplicatesCount(words2);
    }
}
