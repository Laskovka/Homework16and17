package ua.com.alevel.Homework16.Homework;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int result = (int) (o1.getCategory().getCategoryId() - o2.getCategory().getCategoryId());
        if(result == 0) {
            return o2.getPrice().compareTo(o1.getPrice());
        }
        return result;
    }
}
