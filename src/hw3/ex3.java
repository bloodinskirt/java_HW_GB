package hw3;

public class ex3 {

    //  Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
    //  Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
    //  и год издания после 2010 г, включительно.

    public static void main(String[] args) {
        String[][] books = {{"Книга 1", "Иванов", "100", "2015", "50"},
                {"Книга 2", "Абрамов", "200", "2012", "100"},
                {"Книга 3", "Петров", "150", "2018", "150"},
                {"Книга 4", "Андреев", "120", "2010", "80"},
                {"Книга 5", "Сидоров", "80", "2015", "200"}};


        for (String[] book : books) {
            int pageCount = Integer.parseInt(book[4]);
            boolean isPrime = true;
            for (int i = 2; i <= pageCount / 2; i++) {
                if (pageCount % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            boolean hasA = book[1].contains("А");

            int year = Integer.parseInt(book[3]);
            boolean isAfter2010 = year >= 2010;

            if (isPrime && hasA && isAfter2010) {
                System.out.println(book[0]);
            }
        }
    }
}
