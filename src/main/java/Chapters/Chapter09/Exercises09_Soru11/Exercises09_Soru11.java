package Chapters.Chapter09.Exercises09_Soru11;

import java.util.Scanner;

public class Exercises09_Soru11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter values for a,b,c,d,e,f:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("x is " + equation.getX());
            System.out.println("y is " + equation.getY());
        } else {
            System.out.println("The equation has no solution");
        }
    }
}
