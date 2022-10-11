package Chapters.Chapter06.Exercises06;

public class Exercises06_Soru25 {
    public static void main(String[] args) {
        System.out.println(convertMillis(100000));
    }

    public static void testConvertMillis() {
        //0:0:5
        assert convertMillis(5500).equals("0:0:5");

        // 0:1:40
        assert (convertMillis(100000).equals("0:1:40")) : convertMillis(100000);

        // 154:19:10
        assert (convertMillis(555550000).equals("154:19:10")): convertMillis(555550000);

        assert (convertMillis(0).equals("0:0:0")) : convertMillis(0);

        assert (convertMillis(-5500).equals("-0:0:5")): convertMillis(-5500);

    }

    public static String convertMillis(long millis) {
        boolean isPositive = true;

        if (millis < 0){
            millis *= -1;
            isPositive = false;
        }

        long remainingSeconds = millis / 1000;
        long seconds = remainingSeconds % 60;
        remainingSeconds -= seconds;
        long remainingMinutes = remainingSeconds / 60;
        long minutes = remainingMinutes % 60;
        remainingMinutes -= minutes;
        long hours = remainingMinutes / 60;

        return isPositive ?  hours + ":" + minutes + ":" + seconds : "-" + hours + ":" + minutes + ":" + seconds;
    }

}
