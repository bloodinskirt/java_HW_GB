package hw5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        System.out.print("Введите искомое слово: ");
        String targetWord = scanner.nextLine().toLowerCase();

        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] words = input.split("\s+");

        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            if (lowerCaseWord.equals(targetWord)) {
                wordCountMap.put(lowerCaseWord, wordCountMap.getOrDefault(lowerCaseWord, 0) + 1);
            }
        }

        System.out.println(targetWord + " - " + wordCountMap.getOrDefault(targetWord, 0));
    }
}
