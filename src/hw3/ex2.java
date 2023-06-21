package hw3;

public class ex2 {

    // Сведения о товаре состоят из наименования, страны-производителя,
    // веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.
    public static void main(String[] args) {
            String[][] items = {{"Товар 1", "Россия", "1 кг", "100", "1"},
                    {"Товар 2", "Китай", "2 кг", "50", "2"},
                    {"Товар 3", "Китай", "1 кг", "150", "1"},
                    {"Товар 4", "Россия", "3 кг", "200", "2"},
                    {"Товар 5", "Россия", "2 кг", "80", "3"}};

            int minPrice = Integer.MAX_VALUE;
            String itemName = "";

            String sort = "1";

            for (String[] item : items) {
                if (item[4].equals(sort)) {
                    int price = Integer.parseInt(item[3]);
                    if (price < minPrice) {
                        minPrice = price;
                        itemName = item[0];
                    }
                }
            }

            // выводим результат
            System.out.println("Наименование товара заданного сорта с наименьшей ценой: " + itemName);
        }
    }

