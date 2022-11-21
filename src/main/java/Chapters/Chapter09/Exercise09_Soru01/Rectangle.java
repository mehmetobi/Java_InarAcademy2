package Chapters.Chapter09.Exercise09_Soru01;

public class Rectangle {

    double width  ;
    double height ;

    public Rectangle() {
        width = 1 ;
        height = 1 ;
    }

    public Rectangle(double newWidth , double newHeight){
        width = newWidth;
        height = newHeight;
    }


    public double getArea(){
        return height * width;
    }
    public double getPerimeter(){
        return (2 * height) + (2 * width) ;
    }

}
