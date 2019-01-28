package day10;

import java.util.Scanner;

public class ToDoListDemo {

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Let's get things done.");
        System.out.println("Here's what's on your plate:");
        toDoList.print();

        System.out.println("Let's add a new ToDo. What do you need to get done?");
        String description = scanner.nextLine();
        System.out.println("Great. Adding a new ToDo called " + description);
        toDoList.addItem(description);

        System.out.println("Here's what's now on your plate:");
        toDoList.print();
    }

}
