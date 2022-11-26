package Chapters.Chapter11.Exercises11.Exercises11_Soru01;

import java.util.Scanner;

public class Exercises11_Soru01 {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides of triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("Enter color and is filled or not");
        String color = input.next();
        boolean isFilled = input.nextBoolean();
        Triangle triangle = new Triangle(side1,side2,side3);
        triangle.setColor(color);
        triangle.setFilled(isFilled);

        System.out.println(" " + triangle + triangle.getArea()+ triangle.getPerimeter());

    }
}
