package ua.com.alevel.Homework16.Homework;

import java.util.List;

public class BubbleSort {
    public static void sortMethod(List<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            for (int j = i + 1; j < products.size() - 1; j++) {
                if (comparator(products.get(i), products.get(j))) {
                    Product temp = products.get(j);
                    products.set(j, products.get(j));
                    products.set(i, temp);
                }
            }
        }
    }

    private static boolean comparator(Product product1, Product product2) {
        return product1.getCategory().getCategoryId() > product2.getCategory().getCategoryId();
    }
}
