package Chapters.Chapter11.Exercises11.Exercises11_Soru01;

public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;


    public Triangle() {
        this(1.0, 1.0, 1.0);

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public double getSide1 (){
        return this.side1;
    }
    public double getSide2() {
        return this.side2;
    }
    public double getSide3() {
        return this.side3;
    }

    public void setSide1 (){
        this.side1 = side1;
    }
    public void setSide2(){
        this.side2 = side2;
    }
    public void setSide3(){
        this.side3 = side3;
    }

    public double getArea(){
        double s = (this.side1 + this.side2 + this.side3) / 2;
        double area = Math.sqrt(s * (s - this.side1) * (this.side2) * (this.side3));
        return area;
    }
    public double getPerimeter (){
        return this.side1 + this.side2 + this.side3;

    }
    @Override
    public String toString(){
        return "Triangle: side1:" + this.side1 + "\nside2: " + this.side2 + "\nside3: " + this.side3;
    }

}
