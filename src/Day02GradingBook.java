import java.util.Scanner;

public class Day02GradingBook {

    public static void main(String[] args) {
        System.out.println("Sweet, let's evaluate a grade. What was the score?");
        Scanner scanner = new Scanner(System.in);
        String gradeString = scanner.nextLine();
        double grade = Double.parseDouble(gradeString);
        if (grade >= 0 && grade < 60) {
            System.out.println("YOU FAILED.");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("You got a D!");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("You got a C!");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("You got a B!");
        } else if (grade >= 90 && grade < 100) {
            System.out.println("You got an A!");
        } else {
            System.out.println("I couldn't understand the score. Are you sure it's a reasonable number?");
        }
    }

}
