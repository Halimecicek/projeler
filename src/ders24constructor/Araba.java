package ders24constructor;

public class Araba {
    String marka = "marka belirtilmeedi";
    String model = "model belirtilmedi";
    String yakit;
    int yil ;
    int fiyat;

    public Araba(String marka) {
        this.marka = marka;
        this.model=model;
        this.fiyat=fiyat;

    }
    public Araba(String marka, String model, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
    }


    public  Araba (String mrk, String mdl){
       marka=mrk;
       model=mdl;

   }
   public Araba(){

   }

    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat ;
    }
}
