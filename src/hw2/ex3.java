package hw2;

public class ex3 {

    // Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

    public static void main(String[] args) {
        int[] array = {3, -5, 7, -2, 0, -8, 12, 18, -4};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10 && array[i] <= 99) {
                sum += i;
            }

            if (array[i] < 0) {
                array[i] = sum;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
