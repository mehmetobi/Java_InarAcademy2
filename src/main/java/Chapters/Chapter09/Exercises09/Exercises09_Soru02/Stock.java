package Chapters.Chapter09.Exercises09.Exercises09_Soru02;

public class Stock {
    String symbol ;
    String name ;
    double previousClosingPrice ;
    double currentPrice ;


    public Stock ( String newSymbol, String newName ){
    symbol= newSymbol;
    name=newName;

    }
    public double getChangePercent(double previousClosingPrice, double currentPrice){
        return ((previousClosingPrice - currentPrice) / previousClosingPrice ) * 100 ;
    }
}
