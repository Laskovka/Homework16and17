package ua.com.alevel.Homework16.slide10;

import java.util.ArrayList;
import java.util.List;

public class IntegerList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        System.out.println(NumberUtils.getSum(numbers));
        System.out.println(NumberUtils.multiplyOddNumber(numbers));
    }
}
