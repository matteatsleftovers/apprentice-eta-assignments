package day03;

import java.util.Scanner;

public class Day03Multiples {

    public static void main(String[] args) {
        int number;
        do {
            System.out.println("Please enter a number between 1 and 20:");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
        } while (number < 1 || number > 20);

        int multiple = 1;
        while (multiple <= number) {
            System.out.println("4 times " + multiple + " is " + 4 * multiple);
            multiple++;
        }
    }

}
