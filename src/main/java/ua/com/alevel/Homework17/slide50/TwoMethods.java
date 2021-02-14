package ua.com.alevel.Homework17.slide50;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TwoMethods {
    public TreeMap<Integer, List<String>> getLengthWithWords(List<String> words) {
        TreeMap<Integer, List<String>> resultTreeMap = new TreeMap<>();
        for (int i = 0; i < words.size(); i++) {
            resultTreeMap.put(words.get(i).length(), words);
        }
        return resultTreeMap;
    }
}
