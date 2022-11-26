package Chapters.Chapter12.Exercises12.Exercises12_Soru08;

public class HexFormatException extends Exception{

    public HexFormatException(){
        super("It is not a hex formation.");
    }
    public HexFormatException(String s){
        super(s);
    }
}
