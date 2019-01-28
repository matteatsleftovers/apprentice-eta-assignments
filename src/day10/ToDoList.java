package day10;

import java.util.ArrayList;

public class ToDoList {

    private ArrayList<ToDoListItem> items;

    public ToDoList() {
        items = new ArrayList<>();
    }

    public void addItem(String description) {
        items.add(new ToDoListItem(description));
    }

    public ArrayList<ToDoListItem> getItems() {
        return items;
    }

    public void print() {
        for (ToDoListItem item: items) {
            item.print();
        }
    }
}
