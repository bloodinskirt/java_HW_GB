package finalHw;

public class Laptop {
    private static String brand;
    private static double price;
    private static int ram;
    private static double screenSize;

    public Laptop(String brand, double price, int ram, double screenSize) {
        Laptop.brand = brand;
        Laptop.price = price;
        Laptop.ram = ram;
        Laptop.screenSize = screenSize;
    }

    public static String getBrand() {
        return brand;
    }

    public static double getPrice() {
        return price;
    }


    public static int getRam() {
        return ram;
    }


    public static double getScreenSize() {
        return screenSize;
    }

    public String toString() {
        return "Ноутбук [Бренд: " + brand + ", Цена: " + price + ", RAM: " + ram + ", Размер экрана: " + screenSize + "]";
    }
}


