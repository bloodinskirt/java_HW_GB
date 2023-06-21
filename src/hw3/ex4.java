package hw3;

import java.util.ArrayList;

public class ex4 {

    //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);
        numbers.add(2);

        int min = Integer.MAX_VALUE;
        for (int n : numbers) {
            if (n < min) {
                min = n;
            }
        }
        System.out.println("Минимальное значение: " + min);

        int max = Integer.MIN_VALUE;
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println("Максимальное значение: " + max);

        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        double avg = (double) sum / numbers.size();
        System.out.println("Среднее значение: " + avg);
    }
}
