package hw2;
import java.util.Scanner;

public class ex2 {

    // Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел в последовательности: ");
        int n = scanner.nextInt();

        boolean isIncreasing = true;
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            int num = scanner.nextInt();

            if (num <= prev) {
                isIncreasing = false;
                break;
            }
            prev = num;
        }

        if (isIncreasing) {
            System.out.println("Последовательность является возрастающей");
        } else {
            System.out.println("Последовательность не является возрастающей");
        }
    }

}
