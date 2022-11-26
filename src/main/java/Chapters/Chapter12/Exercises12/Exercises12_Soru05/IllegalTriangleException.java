package Chapters.Chapter12.Exercises12.Exercises12_Soru05;

public class IllegalTriangleException extends Exception{

    public IllegalTriangleException(){
        super("Illegal triangle!");
    }
    public IllegalTriangleException(String message){
        super(message);
    }
}
