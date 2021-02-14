package ua.com.alevel.Homework16.Homework;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClassTestOfHomework {
    public static void main(String[] args) {
        Category fruit = new Category("fruit", 1L);
        Category vegetables = new Category("vegetables", 2L);
        Category ice = new Category("ice", 3L);
        Category meat = new Category("meat", 4L);
        Category milk = new Category("milk", 5L);

        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple", new BigDecimal(12.2), fruit));
        products.add(new Product("Tomato", new BigDecimal(43.2), vegetables));
        products.add(new Product("IceCream", new BigDecimal(123.2), ice));
        products.add(new Product("Chicken", new BigDecimal(89.2), meat));
        products.add(new Product("Potato", new BigDecimal(55.2), vegetables));
        products.add(new Product("Milk", new BigDecimal(26.2), milk));
        products.add(new Product("Pear", new BigDecimal(14.2), fruit));
        products.add(new Product("Kefir", new BigDecimal(20.2), milk));
        products.add(new Product("Cow", new BigDecimal(100.2), meat));
        products.add(new Product("SourCream", new BigDecimal(24.2), ice));

        Comparator<Product> productComparator = new ProductComparator();
        products.sort(productComparator);
        System.out.println(products.toString());


    }
}
