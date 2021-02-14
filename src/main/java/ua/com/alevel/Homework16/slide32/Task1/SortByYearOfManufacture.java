package ua.com.alevel.Homework16.slide32.Task1;

import ua.com.alevel.Homework16.slide32.Car;

import java.util.Comparator;

public class SortByYearOfManufacture implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getYearOfManufacture() - o2.getYearOfManufacture();
    }
}
