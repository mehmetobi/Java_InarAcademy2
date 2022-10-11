package Chapters.Chapter06.Exercises06;

public class Exercises06_Soru23 {
    public static void main(String[] args) {
        System.out.println(count("Welcome",'e'));
    }
    public static int count(String str,char a){
        int count = 0;
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) == a){
                count++;
            }
        }
        return count;
    }
}
