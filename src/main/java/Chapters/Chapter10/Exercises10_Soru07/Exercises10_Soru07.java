package Chapters.Chapter10.Exercises10_Soru07;

import Chapters.Chapter09.Exercises09_Soru07.Account;

import java.util.Scanner;

public class Exercises10_Soru07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an id: ");
        int id = input.nextInt();

        Account account = new Account(id, 100) {
            @Override
            public void withDraw(double amount) {

            }
        };
        displayMenu();

        System.out.println("Enter a choice");
        int choice = input.nextInt();

        while (true) {
            switch (choice) {
                case 1:
                    System.out.println("The balance is " + account.getBalance() + "\n");
                    break;
                case 2:
                    System.out.println("Enter an amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Enter an amount to deposit:");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("Enter an id");
                    id = input.nextInt();
                    account.setId(id);
                    account.setBalance(100);
                    break;

            }
            displayMenu();
            System.out.println("Enter a choice");
            choice = input.nextInt();

        }
    }


    public static void displayMenu() {
        System.out.println("Main menu");
        System.out.print("1: check balance\n2: withdraw\n3: deposit\n4: exit\n");
    }
}
