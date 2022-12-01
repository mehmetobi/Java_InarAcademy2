package Chapters.Chapter12.Exercises12.Exercises12_Soru19;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exercises12_Soru19 {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.hopealkazar.com/");
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while(input.hasNext()){
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("The file is " + count + " characters");
        }catch(MalformedURLException ex){
            ex.printStackTrace();
        }catch (java.io.IOException ex){
            ex.printStackTrace();
        }
    }
}
