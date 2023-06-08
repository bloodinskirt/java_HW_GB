import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Дана последовательность целых чисел, оканчивающаяся нулем.
        // Найти сумму положительных чисел, после которых следует отрицательное число.

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int prev = scanner.nextInt();
        while (prev != 0) {
            int curr = scanner.nextInt();
            if (prev > 0 && curr < 0) {
                sum += prev;
            }
            prev = curr;
        }
        System.out.println("Result: " + sum);


        // Leetcode task

        String s = "the sky is blue";
        String reverseString = reverseWords(s);
        System.out.println(reverseString);
    }
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }



}