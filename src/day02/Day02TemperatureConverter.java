package day02;

import java.util.Scanner;

public class Day02TemperatureConverter {

    public static void main(String[] args) {
        System.out.println("Please enter a temperature in Fahrenheit: ");
        Scanner scanner = new Scanner(System.in);
        String fahrenheitTempString = scanner.nextLine();
        double fahrenheitTemp = Double.parseDouble(fahrenheitTempString);
        double celsiusTemp = (fahrenheitTemp - 32) / 1.8;
        System.out.println("All right, sweet. Your temperature in Fahrenheit is " + fahrenheitTemp + "°F");
        System.out.println("Your temperature in Celsius is " + celsiusTemp + "°C");
    }

}
