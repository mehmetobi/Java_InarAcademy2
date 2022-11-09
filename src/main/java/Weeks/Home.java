package Weeks;

public class Home {

    double yuzolcumu;
    int banyoSayisi;
    int odaSayisi;
    boolean garajVarmi;
    double ucret;
    double kiraUcreti;
    String cephe;
    int yil;

    public Home() {

    }

    public Home(double yuzolcumu, int banyoSayisi, int odaSayisi, boolean garajVarmi, double ucret, double kiraUcreti, String cephe, int yil) {
    this.yuzolcumu = yuzolcumu;
    this.banyoSayisi= banyoSayisi;
    this.odaSayisi= odaSayisi;
    this.garajVarmi = garajVarmi;

    }

    public double getYuzolcumu() {
        return yuzolcumu;

    }

    public void setYuzolcumu(double yeniYuzolcumu) {
        this.yuzolcumu = yeniYuzolcumu;
    }


    public int getBanyoSayisi() {
        return banyoSayisi;

    }

    public void setBanyoSayisi(int yenibanyoSayisi) {
        this.banyoSayisi = yenibanyoSayisi;
    }


    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int yeniOdaSayisi) {
        this.odaSayisi = yeniOdaSayisi;
    }

    public boolean isGarajVarmiarajVarmi() {
        return garajVarmi;
    }

    public void isGarajVarmi(boolean garajVarmi) {
        this.garajVarmi = garajVarmi;
    }


    public double getUcret() {
        return ucret;
    }

    public void setUcret(double yeniUcret) {
        this.ucret = yeniUcret;

    }


    public double getKiraUcreti() {
        return kiraUcreti;
    }
    public void setKiraUcreti(double yeniKiraUcreti) {
        this.kiraUcreti = yeniKiraUcreti;
    }

    public String getCephe () {
        return cephe;
    }
    public void setCephe ( String yeniCephe) {
        this.cephe = yeniCephe;
    }


    public int getYil () {
        return yil ;
    }
    public void setYil ( int yeniYil) {
        this.yil = yeniYil;
    }


public void  print (){
    System.out.println("----------------HOME DETAILS------------------");

}


}

