package ua.com.alevel.Homework16.slide10;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public static Integer getSum(List<Integer> numbers) {
        Integer sum = 0;
        for (int i = 0; i < numbers.toArray().length; i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public static List<Integer> multiplyOddNumber(List<Integer> numbers) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < numbers.toArray().length; i++) {
            if (numbers.get(i) % 2 != 0) {
                integerList.add(numbers.get(i) * 2);
            }
        }
        return integerList;
    }
}
