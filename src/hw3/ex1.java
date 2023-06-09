package hw3;

public class ex1 {

    // 1. Дан массив записей: наименование товара, цена, сорт. Найти наибольшую
    // цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший»
    public static void main(String[] args) {
        String[][] items = {{"Товар 1 высший сорт", "100", "1"},
                {"Товар 2 средний сорт", "50", "2"},
                {"Товар 3 высший сорт", "150", "1"},
                {"Товар 4 высший сорт", "200", "2"},
                {"Товар 5 низший сорт", "80", "3"}};

        int maxPrice = 0;

        for (String[] item : items) {
            if (item[0].contains("высший")) {
                if (item[2].equals("1") || item[2].equals("2")) {
                    int price = Integer.parseInt(item[1]);
                    if (price > maxPrice) {
                        maxPrice = price;
                    }
                }
            }
        }

        System.out.println("Наибольшая цена товаров 1го или 2-го сорта среди товаров, название которых содержит «высший»: " + maxPrice);
    }

    // Сведения о товаре состоят из наименования, страны-производителя,
    // веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.

}



