package ua.com.alevel.Homework16.slide32.Task2;

import ua.com.alevel.Homework16.slide32.Car;

import java.util.Comparator;

public class SortByVolume implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int result = (int) (o2.getVolume() - o1.getVolume());
        if(result == 0) {
            return 1;
        }
        return result;
    }
}
