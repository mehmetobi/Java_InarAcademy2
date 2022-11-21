package Chapters.Chapter09.Exercises09_Soru02;

public class Exercises09_Soru02 {
    public static void main(String[] args) {

        Stock stock = new Stock ( "ORCL" ,"Oracle Corporation") ;
        System.out.println("The price change-percentage of \t" + stock.symbol + " is\t " + stock.getChangePercent(34.5, 34.35));

        System.out.printf("The price change-percentage of " + stock.name + " is %2.2f", stock.getChangePercent(34.5, 34.35));
    }
}
