package pkg2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainProducts {
    public static void main(String[] args) {
        List<Product> p = Arrays.asList(
            new Product("Electronics", 1200, "Monday"),
            new Product("Clothes", 50, "Monday"),
            new Product("Electronics", 800, "Tuesday"),
            new Product("Clothes", 75, "Tuesday"),
            new Product("Books", 20, "Monday")
        );

        Map<String, Map<String, List<Integer>>> grouped = Product.groupProducts(p);

        System.out.println(grouped);
    }
}
