package ua.com.alevel.Homework16.slide32.Task1;

import ua.com.alevel.Homework16.slide32.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarImpl {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Nisan", "AMG-9", 2000));
        cars.add(new Car("Nisan", "AMG-2", 653));
        cars.add(new Car("Nisan", "AMG-3", 2221));
        cars.add(new Car("Nisan", "AMG-4", 2002));
        cars.add(new Car("Nisan", "AMG-5", 20052));
        cars.add(new Car("Nisan", "AMG-6", 20));
        cars.add(new Car("Nisan", "AMG-7", 200));
        cars.add(new Car("Nisan", "AMG-8", 2000));
        Comparator<Car> carComparator = new SortByYearOfManufacture();
        cars.sort(carComparator);
        System.out.println(cars.toString());
    }
}
