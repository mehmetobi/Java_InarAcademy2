package Chapters.Chapter06;

public class Checkpoin06_TestRassal {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(Checkpoin06_RassalKarakter.buyukHarfBul() + " ");
        }

        System.out.println();

        for (int i = 0; i < 20; i++) {
            System.out.print(Checkpoin06_RassalKarakter.kucukHarfBul() + " ");
        }

        System.out.println();

        for (int i = 0; i < 20; i++) {
            System.out.print(Checkpoin06_RassalKarakter.rakamBul() + " ");
        }

        System.out.println();

        for (int i = 0; i < 20; i++) {
            System.out.print(Checkpoin06_RassalKarakter.herhangiBirKarakterBul() + " ");
        }
    }
}
