package day02;

public class Day02ArithmeticOps {

    public static void main(String[] args) {
        double a = 26.2;
        double b = 13.1;
        System.out.println("a + b equals " + (a + b));
        System.out.println("a - b equals " + (a - b));
        System.out.println("a * b equals " + String.format("%.2f", (a * b)));
        System.out.println("a / b equals " + (a / b));
        System.out.println("The average of a and b is " + (a + b)/2);
        System.out.println((a > b ? "a" : "b") + " is larger!");
    }

}
