package practic;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Eda {
    static String urun;
    static double kilogram;
    static double toplamTutar=0;
    public static void main(String[] args) {
        //basit bir 5 ürünlü manav alışveriş programi hazirlayin
        //1. adim: urun listesinden urun sectir ve kac kg oldugunu sor
        //2.adim: baska bir urun almak isteyip istemedigini sor istemiyorsa toplam miktari goster, istiyorsa
        //tekrar urun sectir bu islemi alışverişi bitirmek isteyene kadar tekrarla.
        //3. adim: musteri her urun sectiginde aldıgı urunun fiyatını toplam fiyata ekle .
        //4. adim: alışveriş bitince toplam odemesi gereken tutari goster.
        List<String> urunListesi = new ArrayList<>();
        List<Double> fiyatListesi= new ArrayList<>();
        urunListesi.add("salatalik");
        fiyatListesi.add(10.9);
        urunListesi.add("domates");
        fiyatListesi.add(15.5);
        urunListesi.add("biber");
        fiyatListesi.add(16.9);
        urunListesi.add("kabak");
        fiyatListesi.add(17.8);
        urunListesi.add("patlıcan");
        fiyatListesi.add(15.7);

        Scanner scan= new Scanner(System.in);
        System.out.println(urunListesi +"listeden almak istediginiz urunu yaziniz");
        urun =(scan.next()).toLowerCase();

        if (urunListesi.contains(urun)){
            System.out.println(urun + "den kac kilo almak istediginizi yaziniz");
            kilogram= scan.nextDouble();
        }
        else {
            System.out.println("girilen urun listede bulunmamaktadır" +
                    "\nlisteden urun giriniz" + urunListesi);
        }
        double tutar =0;
        tutar = toplamHesapTutari(urunListesi,fiyatListesi,kilogram,urun);
        toplamTutar +=tutar;
        boolean urunTalebi = true;
        while (urunTalebi){
            System.out.println("baska urun eklemek ister misiniz (e/h)");
            String devamDurumu = scan.next();
            if (devamDurumu.equalsIgnoreCase("e")){
                System.out.println(urunListesi + "Almak isteidginiz diger urunu giriniz");
                urun=(scan.next()).toLowerCase();
                if (urunListesi.contains(urun)){
                    System.out.println(urun + "'den kac kg almak istediginizi yaziniz");
                    kilogram=scan.nextDouble();
                }
                else {
                    System.out.println("girilen urun listede bulunmamaktadır"+
                            "\nlutfen listeden urun seciniz" + urunListesi);
                }
                tutar = toplamHesapTutari(urunListesi,fiyatListesi,kilogram,urun);
                toplamTutar+=tutar;
            } else if (devamDurumu.equalsIgnoreCase("h")) {
                urunTalebi=false;

            }
        }
        System.out.println("urunlerin toplam hesap tutari: " + toplamTutar + "TL");
    }

    public static double toplamHesapTutari(List<String> urunListesi, List<Double> fiyatListesi, double kilogram, String urun) {
        double toplamTutar=0;
        if (urun.equalsIgnoreCase("salatalık")){
            toplamTutar +=kilogram* fiyatListesi.get(urunListesi.indexOf("salatalık"));

        } else if (urun.equalsIgnoreCase("domates")) {
            toplamTutar +=kilogram* fiyatListesi.get(urunListesi.indexOf("domates"));

        }else if (urun.equalsIgnoreCase("biber")) {
            toplamTutar += kilogram * fiyatListesi.get(urunListesi.indexOf("biber"));

        }else if (urun.equalsIgnoreCase("kabak")) {
            toplamTutar += kilogram * fiyatListesi.get(urunListesi.indexOf("kabak"));

        }else if (urun.equalsIgnoreCase("patlıcan")) {
            toplamTutar += kilogram * fiyatListesi.get(urunListesi.indexOf("patlıcan"));
        }
        return toplamTutar;
    }
}
