package Chapters.Chapter06.Exercises06;

public class Exercises06_Soru16 {
    public static void main(String[] args) {
    for(int i= 2000; i<= 2020; i++){
        System.out.println("In " + i + " there are " + numberOfDaysInAYear(i) + " days.");
    }
    }
    public static int numberOfDaysInAYear(int year){
    boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    int numberOfDays;
    if (isLeapYear){
        numberOfDays = 366;
    } else {
        numberOfDays = 365;
    }
        return numberOfDays;
    }



}
