import java.util.Scanner;

public class Day02RubberDuck {

    public static void main(String[] args) {
        System.out.println("Please ask your rubber duck a question:");
        Scanner scanner = new Scanner(System.in);
        String questionString = scanner.nextLine();
        if (questionString.length() < 200) {
            System.out.println("Ask a better question!");
        } else if (questionString.length() > 500) {
            System.out.println("Simplify your question!");
        } else {
            System.out.println("Search inside yourself. I know you know this.");
        }
    }

}
