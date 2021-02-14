package ua.com.alevel.Homework17.Homework;

import java.util.*;

public class MethodReplaceKeyValue {
    public static void replaceKeyValue(Map<String, String> map) {
        List<String> keysList = new ArrayList<>(map.keySet());
        List<String> valuesList = new ArrayList<>(map.values());
        int size = map.size();
        map.clear();
        for (int i = 0; i < size; i++) {
            map.put(valuesList.get(i), keysList.get(i));
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("one","один");
        map.put("two","два");
        map.put("three","три");
        map.put("four","четыре");
        map.put("five","пять");
        System.out.println(map);
        replaceKeyValue(map);
    }
}
