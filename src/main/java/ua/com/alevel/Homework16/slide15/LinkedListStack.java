package ua.com.alevel.Homework16.slide15;

import java.util.LinkedList;

public class LinkedListStack {
    private final LinkedList<String> linkedList = new LinkedList<>();

    public void push(String data) {
        linkedList.add(data);
    }

    public void pop() {
        linkedList.pop();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}
