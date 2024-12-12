import java.util.Arrays;
import java.util.List;

public class MaxConsonantsFinder {
    public static int countConsonants(String str) {
        String vowels = "aeiouаеєиіїоуюя";
        int count = 0;

        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
                count++;
            }
        }

        return count;
    }

    public static String findMaxConsonants(List<String> strings) {
        return strings.stream()
                .max((s1, s2) -> Integer.compare(countConsonants(s1), countConsonants(s2)))
                .orElse("Список порожній");
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Привіт", "Як справи?", "Творчість Шевченка", "Java");


        String result = findMaxConsonants(strings);


        System.out.println("Рядок з максимальною кількістю приголосних: " + result);
    }
}
