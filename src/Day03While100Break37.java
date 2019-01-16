public class Day03While100Break37 {

    public static void main(String[] args) {
        int counter = 0;
        while (counter < 100) {
            System.out.println("The counter has value " + counter);
            if (counter == 37) break;
            counter++;
        }
    }

}
