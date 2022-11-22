package Chapters.Chapter09.Exercises09_Soru08;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3 ;

    private int speed ;
    private boolean on ;
    private double radius ;
    String color;

    public Fan (){

        speed = SLOW;
        on = false ;
        radius = 5 ;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn (){
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius (){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor (){
        return color;
    }
    public void setColor (String color){
        this.color = color ;
    }
    @Override
    public String toString() {
        if (on) {
            return ("Fan speed " + getSpeed() + "\ncolor: " + getColor() + "\nradius: " + getRadius());
        }
        return ("color: " + getColor() + "\nradius: " + getRadius() + "\nfan is off");
    }



}

