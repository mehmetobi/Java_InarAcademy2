package Chapters.Chapter12.Exercises12.Exercises12_Soru04;

import Chapters.Chapter11.Exercises11.Exercises11_Soru06.Loan;

public class Exercises12_Soru04 {
    public static void main(String[] args) {
        try{
            LoanWithException loan = new LoanWithException(1,1,1000);
            loan.setLoanAmount(0);
        }catch(IllegalArgumentException ex){
            System.out.println("Please enter a value greater than zero");
        }
    }

}
