package pkg2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Product {
    private String category;
    private int price;
    private String day;

    public Product(String category, int price, String day) {
        this.category = category;
        this.price = price;
        this.day = day;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public String getDay() {
        return day;
    }

    public static Map<String, Map<String, List<Integer>>> groupProducts(List<Product> products) {
        return products.stream().collect(Collectors.groupingBy(Product::getCategory,
                                       Collectors.groupingBy(Product::getDay,
                                       Collectors.mapping(Product::getPrice, Collectors.toList()))));
    }
}
