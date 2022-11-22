package Chapters.Chapter10.Exercises10_Soru16;

import java.math.BigInteger;

public class Exercises10_Soru16 {

    public static void main(String[] args) {

        String s = "1";
        for (int i = 0; i < 49; i++) {
            s += "0";
        }

        BigInteger num = new BigInteger(s);
        BigInteger num_zero = new BigInteger("0");
        BigInteger num_two = new BigInteger("2");
        BigInteger num_three = new BigInteger("3");

        int count = 0;

        while (count < 10) {

            if (num.remainder(num_two).compareTo(num_zero) == 0 || num.remainder(num_three).compareTo(num_zero) == 0) {
                System.out.println(num);
                count++;
            }

            num = num.add(BigInteger.ONE);
        }

    }



}
