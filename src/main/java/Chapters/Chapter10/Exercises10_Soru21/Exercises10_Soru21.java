package Chapters.Chapter10.Exercises10_Soru21;

import java.math.BigInteger;

public class Exercises10_Soru21 {
    public static void main(String[] args) {

        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        number.add(BigInteger.ONE);
        BigInteger five = new BigInteger("5");
        BigInteger six = new BigInteger("6");
        int count = 0;
        while (count < 10) {

            if (number.remainder(five).equals(BigInteger.ZERO) || number.remainder(six).equals(BigInteger.ZERO)) {

                count++;
                System.out.println(number);
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
