package day04;

public class Day04Divisibility {

    public static void main(String[] args) {
        int possibleNumber = 1;
        int range = 20;
        while (true) {
            boolean sieve = true;
            for (int i = 1; i <= range; i++) {
                sieve &= (possibleNumber % i == 0);
            }
            if (sieve) break;
            possibleNumber++;
        }
        System.out.println("That super divisible number is " + possibleNumber);
    }

}
