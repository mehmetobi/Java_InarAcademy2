package Chapters.Chapter10.Exercises10_Soru09;

public class Kurs {
    private String isim;
    private String[] ogrenciler;
    private int ogrenciSayisi;

    private static final int MAX_OGRENCI = 60;

    public Kurs(String isim) {
        this.isim = isim;
        ogrenciler = new String[MAX_OGRENCI];
    }

    public void ogrenciEkle(String ogrenciIsmi) {
        if (ogrenciSayisi >= MAX_OGRENCI) {
            throw new RuntimeException("Sinif doluyken ogrenci eklenemez");
        }

        ogrenciler[ogrenciSayisi] = ogrenciIsmi;
        ogrenciSayisi++;
    }

    public void ogrenciCikart(String ogrenciIsmi) {
        int index = -1;
        for (int i = 0; i < ogrenciSayisi; i++) {
            if (ogrenciler[i].equals(ogrenciIsmi)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            throw new RuntimeException("Ogrenci bulunamadi");
        }
        for (int i = index; i < ogrenciSayisi - 1; i++) {
            ogrenciler[i] = ogrenciler[i + 1];
        }
        ogrenciSayisi--;
    }

    public String getIsim() {
        return isim;
    }

    public String[] getOgrenciler() {
        return ogrenciler;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }
}
