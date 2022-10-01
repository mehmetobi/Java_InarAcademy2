package Chapters.Chapter06.Exercises06;

public class Exercises06_Soru01 {
    public static int getPentagonalNumber(int n) {

        //n(3n–1)/2 bu formülü kullanabilen bir metot yaz

        // Input : 1,2,3
        // Output : 1, 5, 12
        int PentagonalNumber = n * (3 * n - 1) / 2 ;

        return PentagonalNumber;

    }
}
