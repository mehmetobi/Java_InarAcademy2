package Chapters.Chapter06;

public class Checkpoint06_NPrintln {
    public static void main(String[] args) {
        nPrintl("Merhaba Java!" , 6);
    }

    static void nPrintl(String mesaj, double donguSayisi){
        for ( int j =0; j < donguSayisi; j++){
            System.out.println(mesaj);
        }
    }
}
