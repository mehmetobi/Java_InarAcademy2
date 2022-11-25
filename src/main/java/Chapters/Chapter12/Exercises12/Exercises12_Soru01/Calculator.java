package Chapters.Chapter12.Exercises12.Exercises12_Soru01;

public class Calculator {
    public static void main(String[] args) {
        CheckInput(args[0]);
        CheckInput(args[2]);
        int result = 0 ;

        switch (args[1].charAt(0)){
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '.':
                result= Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;
        }
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }


    public static void CheckInput(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                System.out.println("Wrong input: " + str);
            }
        }
    }
}
