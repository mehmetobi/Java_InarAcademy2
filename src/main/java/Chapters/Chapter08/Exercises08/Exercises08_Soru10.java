package Chapters.Chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_Soru10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points:");
        int numberOfPoints = input.nextInt();
        double points[][] = new double[numberOfPoints][2];
        System.out.println("Enter " + numberOfPoints + " points :  ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        int p1 = 0;
        int p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if (shortestDistance > distance) {
                    shortestDistance = distance;
                }
            }

        }
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double dist = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if (dist == shortestDistance) {
                    System.out.println("The closest two points are (" + points[i][0] + ", " + points[i][1] + ") and (" + points[j][0] + ", " + points[j][1] + ")");
                }
            }
        }
        System.out.println("Their distance is " + shortestDistance);
    }


    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
