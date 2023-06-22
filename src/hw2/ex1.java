package hw2;
import java.util.Scanner;
public class ex1 {

    // Дана последовательность N целых чисел. Найти сумму простых чисел.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел в последовательности: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            int num = scanner.nextInt();

            boolean isPrime = true;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && num > 1) {
                sum += num;
            }
        }

        System.out.println("Сумма простых чисел: " + sum);
    }
}
