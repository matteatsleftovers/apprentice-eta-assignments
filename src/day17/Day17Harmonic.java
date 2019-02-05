package day17;

import java.math.BigDecimal;

public class Day17Harmonic {
    private static final int MAX = 50000;

    public static void main(String[] args) {
        BigDecimal sumLeftToRight = sumHarmonicLeftToRight();
        BigDecimal sumRightToLeft = sumHarmonicRightToLeft();
        System.out.println("The harmonic sum, left to right, up to " + MAX + " is " + sumLeftToRight);
        System.out.println("The harmonic sum, right to left, up to " + MAX + " is " + sumRightToLeft);
        if (sumLeftToRight.equals(sumRightToLeft)) {
            System.out.println("Surprise! They're the same result!");
        } else {
            System.out.println("You probably rounded incorrectly!");
        }
    }

    private static BigDecimal sumHarmonicLeftToRight() {
        BigDecimal sum = new BigDecimal(0.0);
        for (double i = 1.0; i <= MAX; i += 1.0) {
            sum = sum.add(new BigDecimal(1.0/i));
        }
        return sum;
    }

    private static BigDecimal sumHarmonicRightToLeft() {
        BigDecimal sum = new BigDecimal(0.0);
        for (double i = MAX; i > 0.0; i -= 1.0) {
            sum = sum.add(new BigDecimal(1.0/i));
        }
        return sum;
    }
}
