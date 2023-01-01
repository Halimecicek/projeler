package practic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_Atm {

    static String urun;
    static double kilogram;
    static double toplamtutar = 0;

    public static void main(String[] args) {
        // * Basit bir 5 ürünlü manav alisveris programi yaziniz.
        // *
        // * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor. 2. Adim :
        // * Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
        // * goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene
        // * kadar tekrarla. 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
        // * toplam fiyata ekle. 4. Adim : Alisveris bitince toplam odemesi gereken tutari
        // * goster.
        // *
        List<String> urunlistesi = new ArrayList<>();
        List<Double> fiyatlistesi = new ArrayList<>();
        urunlistesi.add("patates");
        fiyatlistesi.add(9.9);
        urunlistesi.add("sogan");
        fiyatlistesi.add(6.9);
        urunlistesi.add("domates");
        fiyatlistesi.add(7.9);
        urunlistesi.add("havuc");
        fiyatlistesi.add(5.9);
        urunlistesi.add("kabak");
        fiyatlistesi.add(8.9);
        Scanner scan = new Scanner(System.in);
        System.out.println(urunlistesi + ">>" + " bu urun listesinden almak istediginiz bir urunu yaziniz: ");
        urun =(scan.next()).toLowerCase();
        if (urunlistesi.contains(urun)) {
            System.out.println(urun + "deb kac kilogram almak istedinizi yaziniz");
            kilogram = scan.nextDouble();
        } else {
            System.out.println("girilen urun bulunmamaktadir" + "lutfen yeni urun giriniz" + urunlistesi);
        }
        double tutar = 0;
        tutar =
                sepetToplamHesapla(urunlistesi,fiyatlistesi,kilogram,urun);
        toplamtutar+=tutar;
        boolean urunTalebi = true;
        while (urunTalebi){
            System.out.println("Sepetinize baska bir urun almak eklemek ister misiniz? (E/H)");
            String devamDurumu = scan.next();
            if (devamDurumu.equalsIgnoreCase("e")){
                System.out.println(urunlistesi + ">>" + " bu urun listesindeki almak istediginiz bir urunu yaziniz: " );
                urun = (scan.next()).toLowerCase();
                if (urunlistesi.contains(urun)){
                    System.out.println(urun + "'den kac kilo almak istediginizi yaziniz: ");
                    kilogram = scan.nextDouble();
                }
                else{
                    System.out.println("Girilen urun manavımızda bulunmamaktadir!" +
                            "\nLutfen urunlistesindeki bulunan urunlerimizden seciniz >> " + urunlistesi);
                }
                tutar = sepetToplamHesapla(urunlistesi,fiyatlistesi,kilogram,urun);
                toplamtutar+=tutar;

            } else if (devamDurumu.equalsIgnoreCase("h")) {
                urunTalebi=false;
            }
        }
        System.out.println("Sepetinizdeki urulerin toplam tutari: " + toplamtutar + " Turk Lirasıdır.");
    }



    public static double
    sepetToplamHesapla(List<String> urunlistesi,
                       List<Double> fiyatListesi, double kilogram, String urun) {
        double toplamTutar = 0;
        if (urun.equalsIgnoreCase("patates")) {
            toplamTutar += kilogram * fiyatListesi.get(urunlistesi.indexOf("patates"));
        } else if (urun.equalsIgnoreCase("sogan")) {
            toplamTutar += kilogram * fiyatListesi.get(urunlistesi.indexOf("sogan"));
        } else if (urun.equalsIgnoreCase("domates")) {
            toplamTutar += kilogram * fiyatListesi.get(urunlistesi.indexOf("domates"));
        } else if (urun.equalsIgnoreCase("biber")) {
            toplamTutar += kilogram * fiyatListesi.get(urunlistesi.indexOf("havuc"));
        } else if (urun.equalsIgnoreCase("patlican")) {
            toplamTutar += kilogram * fiyatListesi.get(urunlistesi.indexOf("kabak"));
        }
        return toplamTutar;
    }

}