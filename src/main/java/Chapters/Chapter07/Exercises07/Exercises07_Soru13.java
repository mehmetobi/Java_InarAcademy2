package Chapters.Chapter07.Exercises07;

public class Exercises07_Soru13 {
    public static void main(String[] args) {
        System.out.println(getRandom(1,2,3,4,5,6,7,8,9,0));
    }
    public static int getRandom(int... numbers){
        int randomNumber = 0;
        boolean isInclude = true;
        while (isInclude){
            randomNumber = (int)(1 + Math.random() * 54);
            for (int i = 0; i <numbers.length ; i++) {
                if(randomNumber == numbers[i]){
                    isInclude = true;
                    break;
                }else{
                    isInclude = false;
                }
            }

        }
        return randomNumber;
    }
}
