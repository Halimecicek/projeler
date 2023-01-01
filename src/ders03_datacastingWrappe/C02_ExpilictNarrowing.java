package ders03_datacastingWrappe;

public class C02_ExpilictNarrowing {

    public static void main(String[] args) {

        int sayi = 20;

        // genis data turundeki degeri dar data turundeki bir variable atamak isterseniz java kabul etmez
        // bu sorumlululgu almak icin cast edeceginiz degeri () icine almak gerekir

        short sh = (short)sayi;

        System.out.println(sh);

        double dbl =23.5;
        int say= (int)dbl;
        System.out.println(say);

        say=115;
        byte byt= (byte)say;
        System.out.println(byt);


    }
}
