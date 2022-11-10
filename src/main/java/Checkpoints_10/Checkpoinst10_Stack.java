package Checkpoints_10;

public class Checkpoinst10_Stack {
    private int[] elemanlar;
    private int elemanSayisi;
    private int kapasite;

    public Yigin() {
        this(20);
    }

    public Yigin(int kapasite) {
        this.kapasite = kapasite;
        elemanlar = new int[kapasite];
        elemanSayisi = 0;
    }

    public void push(int yeniEleman) {
        if (doluMu()) {
            throw new RuntimeException("Yigin dolu");
        }
        elemanlar[elemanSayisi] = yeniEleman;
        elemanSayisi++;
    }

    public int pop() {
        if (bosMu()) {
            throw new RuntimeException("Yigin bos");
        }
        elemanSayisi--;
        return elemanlar[elemanSayisi];
    }

    public int peek() {
        if (bosMu()) {
            throw new RuntimeException("Yigin bos");
        }
        return elemanlar[elemanSayisi - 1];
    }

    public boolean bosMu() {
        return (elemanSayisi == 0);
    }

    public boolean doluMu() {
        return (elemanSayisi == kapasite);
    }

    public int getElemanSayisi() {
        return elemanSayisi;
    }
}


