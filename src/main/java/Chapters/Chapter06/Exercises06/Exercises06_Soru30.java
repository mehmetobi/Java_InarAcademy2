package Chapters.Chapter06.Exercises06;

public class Exercises06_Soru30 {
    public static void main(String[] args) {
        int i = 0;
        while (i != 1) {
            int die1 = (int) (1 + Math.random() * 6);
            int die2 = (int) (1 + Math.random() * 6);
            int sum = die1 + die2;
            if (sum == 7 || sum == 11) {
                System.out.println("You rolled " + die1 + " + " + die2 + " = " + (die1 + die2));
                System.out.println("You win");
                i++;
            } else if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You rolled " + die1 + " + " + die2 + " = " + (die1 + die2));
                System.out.println("You lose");
                i++;
            } else {
                System.out.println("You rolled " + die1 + " + " + die2 + " = " + (die1 + die2));
                System.out.println("The point is " + (die1 + die2));
                die1 = (int) (1 + Math.random() * 6);
                die2 = (int) (1 + Math.random() * 6);
                if (die1 + die2 == sum) {
                    System.out.println("You rolled " + die1 + " + " + die2 + " = " + (die1 + die2));
                    System.out.println("You win");
                    i++;
                } else {
                    System.out.println("You rolled " + die1 + " + " + die2 + " = " + (die1 + die2));
                    System.out.println("You lost");
                    i++;

                }
            }
        }
    }
}
