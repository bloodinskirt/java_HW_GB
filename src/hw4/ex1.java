package hw4;
import java.util.Scanner;

public class ex1 {

    // Вывести список на экран в перевернутом виде (без массивов и ArrayList)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы списка через пробел: ");
        String input = scanner.nextLine();

        String[] items = input.split(" ");
        for (int i = items.length - 1; i >= 0; i--) {
            System.out.print(items[i] + " ");
        }
    }
}
