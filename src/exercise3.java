import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class exercise3 {
    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
