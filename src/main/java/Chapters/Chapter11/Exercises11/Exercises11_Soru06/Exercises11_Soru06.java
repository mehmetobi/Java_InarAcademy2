package Chapters.Chapter11.Exercises11.Exercises11_Soru06;

import java.util.ArrayList;
import java.util.Date;


public class Exercises11_Soru06 {
    public static void main(String[] args) {


            ArrayList<Object> list = new ArrayList<>();
            list.add(new Loan());
            list.add(new Date());
            list.add(new Circle());

            for (Object o : list) {
                System.out.println(o.toString());
            }

        }
    }

