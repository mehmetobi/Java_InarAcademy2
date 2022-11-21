package Chapters.Chapter09.Exercises09_Soru06;

public class Exercises09_Soru06 {

    public static void main(String[] args) {

        StopWatch stopwatch = new StopWatch();

        int[] numbers = new int[100_000];
        for (int i = 0; i < 100_000; i++) {
            double random = Math.random() * 100;
            numbers[i] = (int) random;
            System.out.println(numbers[i]);
        }
        stopwatch.start();
        java.util.Arrays.sort(numbers);
        stopwatch.stop();
        System.out.println("Start: " + stopwatch.getStartTime());
        System.out.println("End: " + stopwatch.getEndTime());
        System.out.println("Execution time: " +stopwatch.getElapsedTime());
    }
}