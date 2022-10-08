package Chapters.Chapter07.Checkpoints07;

import java.util.Scanner;

public class Checkpoint07_GunleriTutanDizi {
    public static void main(String[] args) {
        String[] gunler = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};
        System.out.println("Haftanın gununu belirlemek icin lutfen birden yediye kadar bir sayi giriniz:");
        Scanner klavye = new Scanner(System.in);
        int secim = klavye.nextInt();

        System.out.println("Sectiginiz gun:" + gunler[secim -1]);

    }
}
