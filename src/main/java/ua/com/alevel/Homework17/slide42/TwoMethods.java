package ua.com.alevel.Homework17.slide42;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TwoMethods {
    public static HashMap<String, Integer> getWordsWithLength(List<String> words) {
        HashMap<String, Integer> resultHashMap = new HashMap<>();
        for (String word : words) {
            resultHashMap.put(word, word.length());
        }
        return resultHashMap;
    }

    public static HashMap<String, Integer> getCountedWords(List<String> words) {
        List<String> tempList = new LinkedList<>(words);
        HashMap<String, Integer> resultHashMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < tempList.size(); i++) {
            count = 1;
            if (!(resultHashMap.containsKey(tempList.get(i)))) {
                for (int j = i + 1; j < tempList.size(); j++) {
                    if (tempList.get(i).equals(tempList.get(j))) {
                        count++;
                    }
                }
                resultHashMap.put(words.get(i), count);
            }
        }
        return resultHashMap;
    }

    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();
        stringList.add("one");
        stringList.add("b");
        stringList.add("three");
        stringList.add("four");
        stringList.add("seven");
        stringList.add("eight");
        stringList.add("nine");
        stringList.add("twelve");
        stringList.add("eleven");
        stringList.add("one");
        stringList.add("a");
        stringList.add("twentyOne");
        stringList.add("seventyFour");
        stringList.add("one");
        stringList.add("null");
        System.out.println(getWordsWithLength(stringList));
        System.out.println(getCountedWords(stringList));
    }
}
