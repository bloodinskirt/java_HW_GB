package finalHw;

import java.util.*;

public class Filtration {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Dell", 1000.0, 8, 15.6));
        laptops.add(new Laptop("HP", 800.0, 16, 14.0));
        laptops.add(new Laptop("Lenovo", 1200.0, 8, 13.3));
        laptops.add(new Laptop("Asus", 1500.0, 16, 17.3));

        Map<String, Object> filterCriteria = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите бренд ноутбука для фильтрации: ");
        String brandFilter = scanner.nextLine();
        filterCriteria.put("brand", brandFilter);

        System.out.print("Введите минимальную цену ноутбука для фильтрации: ");
        double minPriceFilter = scanner.nextDouble();
        filterCriteria.put("minPrice", minPriceFilter);

        System.out.print("Введите минимальный объем RAM ноутбука для фильтрации: ");
        int minRamFilter = scanner.nextInt();
        filterCriteria.put("minRam", minRamFilter);

        System.out.print("Введите минимальный размер экрана ноутбука для фильтрации: ");
        double minScreenSizeFilter = scanner.nextDouble();
        filterCriteria.put("minScreenSize", minScreenSizeFilter);

        filterLaptops(laptops, filterCriteria);
    }

    public static void filterLaptops(Set<Laptop> laptops, Map<String, Object> filterCriteria) {
        for (Laptop laptop : laptops) {
            String brandFilter = (String) filterCriteria.get("brand");
            double minPriceFilter = (Double) filterCriteria.get("minPrice");
            int minRamFilter = (Integer) filterCriteria.get("minRam");
            double minScreenSizeFilter = (Double) filterCriteria.get("minScreenSize");

            if (Laptop.getBrand().equals(brandFilter) &&
                    Laptop.getPrice() >= minPriceFilter &&
                    Laptop.getRam() >= minRamFilter &&
                    Laptop.getScreenSize() >= minScreenSizeFilter) {
                System.out.println(laptop);
            }
        }
    }
}
