package ua.com.alevel.Homework16.Homework;

import java.util.Comparator;

public class CategoryComparator implements Comparator<Category> {
    @Override
    public int compare(Category o1, Category o2) {
        return (int) (o1.getCategoryId() - o2.getCategoryId());
    }
}
