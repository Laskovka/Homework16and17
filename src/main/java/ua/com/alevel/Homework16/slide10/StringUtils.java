package ua.com.alevel.Homework16.slide10;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static List<String> getDuplicates(List<String> words) {
        List<String> duplicates = new ArrayList<>();
        for (int i = 0; i < words.toArray().length; i++) {
            if(words.indexOf(words.get(i)) != words.lastIndexOf(words.get(i)) && !(duplicates.contains(words.get(i)))) {
                duplicates.add(words.get(i));
            }
        }
        return duplicates;
    }

    public static String getLongestWord(List<String> words) {
        String finalString = "";
        int length = 0;
        for (int i = 0; i < words.toArray().length; i++) {
            if(words.get(i).length() > length) {
                length = words.get(i).length();
                finalString = words.get(i);
            }
        }
        return finalString;
    }
}
