package Chapters.Chapter10.Exercises10_Soru17;

import java.math.BigInteger;

public class Exercises10_Soru17 {
    public static void main(String[] args) {

        String max_value = Long.MAX_VALUE + "";
        String word = new String("emre");

        StringBuilder word_2 = new StringBuilder(20);
        StringBuffer word_3 = new StringBuffer(10);

        word_3.append("11111111111111111111111111111111111111111111111111111111111111111");
        System.out.println(word_3);


        BigInteger num = new BigInteger(max_value);
        num = num.add(BigInteger.ONE);

        System.out.println(num.sqrt());

        int count = 0;
        while (count < 10) {

            if (1 == 1) {
                // System.out.println(num);
                count++;
            }

            num = num.add(BigInteger.ONE);
        }

    }
}
