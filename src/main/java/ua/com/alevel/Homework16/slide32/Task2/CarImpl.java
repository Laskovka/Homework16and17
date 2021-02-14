package ua.com.alevel.Homework16.slide32.Task2;

import ua.com.alevel.Homework16.slide32.Car;
import ua.com.alevel.Homework16.slide32.Task1.SortByYearOfManufacture;

import java.util.Comparator;
import java.util.TreeSet;

public class CarImpl {
    public static void main(String[] args) {
        Comparator<Car> carComparator = new SortByVolume();

        TreeSet<Car> carTreeSet = new TreeSet<>(carComparator);
        carTreeSet.add(new Car("Nisan", "AMG-9", 2000, 11.2));
        carTreeSet.add(new Car("Nisan", "AMG-9", 2000, 16.2));
        carTreeSet.add(new Car("Nisan", "AMG-9", 2000, 9.2));
        carTreeSet.add(new Car("Nisan", "AMG-9", 2000, 1.2));
        carTreeSet.add(new Car("Nisan", "AMG-9", 2000, 77.2));
        carTreeSet.add(new Car("Nisan", "AMG-9", 2000, 70.2));
        carTreeSet.add(new Car("Nisan", "AMG-9", 2000, 71.2));
        carTreeSet.add(new Car("Nisan", "AMG-2", 653));
        carTreeSet.add(new Car("Nisan", "AMG-3", 2221));
        carTreeSet.add(new Car("Nisan", "AMG-4", 2002));
        carTreeSet.add(new Car("Nisan", "AMG-5", 20052));
        carTreeSet.add(new Car("Nisan", "AMG-6", 20));
        carTreeSet.add(new Car("Nisan", "AMG-7", 200));
        carTreeSet.add(new Car("Nisan", "AMG-8", 2000));
        System.out.println(carTreeSet.toString());
    }
}
