package ua.com.alevel.Homework16.slide10;

import java.util.ArrayList;
import java.util.List;

public class StringList {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Thirdffff");
        strings.add("First");
        strings.add("Fifrst");
        strings.add("Second");
        strings.add("Fisrst");
        strings.add("Firsxt");
        strings.add("First");
        System.out.println(StringUtils.getDuplicates(strings));
        System.out.println(StringUtils.getLongestWord(strings));
    }
}
