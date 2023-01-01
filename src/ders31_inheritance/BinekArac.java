package ders31_inheritance;

public class BinekArac extends Arac {
    protected String marka = "binek araclarin markasi vardir";
    protected String model = "binek araclarin modeli olur";
    protected int yil = 1900;

    protected void hiz(String yakit) {
        System.out.println("binek araclarin hizi modele gore degisir");
    }

    protected void teker() {
        System.out.println("binek araclarin 4 tekeri olur");
    }
}