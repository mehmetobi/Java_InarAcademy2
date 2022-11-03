package Chapters.Chapter09.Exercises09.Exercise09_Soru01;

public class Exercises09_Soru01 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4 ,40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle1's width:" + rectangle1.width + "\t\theight:" + rectangle1.height + "\t\tarea:" + rectangle1.getArea()+ "\t\tperimeter:" + rectangle1.getPerimeter());

        System.out.println("Rectangle2' width:" + rectangle2.width + "\t\theight:" + rectangle2.height + "\t\tarea:" + rectangle2.getArea() + "\t\tperimeter:" + rectangle2.getPerimeter());



    }

}
