package finalHw;

import java.util.HashSet;
import java.util.Set;

public class CreatingLaptops {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        laptops.add(new Laptop("Dell", 1000.0, 8, 15.6));
        laptops.add(new Laptop("HP", 800.0, 16, 14.0));
        laptops.add(new Laptop("Lenovo", 1200.0, 8, 13.3));
        laptops.add(new Laptop("Asus", 1500.0, 16, 17.3));

        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }
}
