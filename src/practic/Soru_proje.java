package practic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru_proje {

    static String urun ;
    static double toplamTutar=0;
    static int adet=0;



    public static void main(String[] args) {
       // Mağazada da 5 adet ürün mevcut. Eğer seçeceğiniz iki
      //  ürünün fiyatı 100 TL'den fazla ise ekranda bu ürünlere paranız yetmemektedir
        //  yazdıran kod bloğunu yazın

        List<String> urunler = new ArrayList<>();
        List<Double> fiyat = new ArrayList<>();
        urunler.add("kazak");
        fiyat.add(39.99);
        urunler.add("etek");
        fiyat.add(49.99);
        urunler.add("gomlek");
        fiyat.add(59.99);
        urunler.add("pantolon");
        fiyat.add(69.99);
        urunler.add("ceket");
        fiyat.add(89.99);


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen almak istediginiz urunu yaziniz");
        urun = (scan.next()).toLowerCase();

        if(urunler.contains(urun)){
            System.out.println(urun + "den kac adet almak istediginizi yaziniz");
            adet= scan.nextInt();
        }else {
            System.out.println("girilen urun magazimizda bulunmamaktadir \nlutfen magazada bulunan urunlerden seciniz "+urunler);
        }

        double tutar=0;
        tutar=alisveristoplamtutar(urunler,fiyat,adet,urun);
       toplamTutar+=tutar;
       boolean uruntalebi=true;
        while (uruntalebi){
            System.out.println("Baska urun almak ister misiniz? (E/H)");
            String devamDurumu= scan.next();
            if (devamDurumu.equalsIgnoreCase("e")){
                System.out.println(urunler + "urun listesinden almak istediginiz urunu yaziniz");
                urun=(scan.next()).toLowerCase();
                if (urunler.contains(urun)) {
                    System.out.println(urun + "den kac adet almak istediginizi yaziniz");
                    adet = scan.nextInt();
                } else {
                    System.out.println("girilen urun magazamizda bulunmamaktadir" +
                            "\nLutfen magazamizda bulunan urunlerden seciniz >>" + urunler);
                }
                tutar=alisveristoplamtutar(urunler,fiyat,adet,urun);
                toplamTutar+=tutar;

            } else if (devamDurumu.equalsIgnoreCase("h")) {
                uruntalebi=false;
            }
        }
        System.out.println("alisverisiniziin toplam tutari: " + toplamTutar + "TL`DIR");

        if (toplamTutar<=200){
            System.out.println("urunleri alabilirsiniz bakiyeniz yeterlidir");
        }else {
            System.out.println("bakiyeniz yetersiz oldugu icin urunleri alamazsiniz");
}
    }

    public static double alisveristoplamtutar(List<String> urunler, List<Double> fiyat, int adet, String urun) {
      double  toplamTutar=0;
        if (urun.equalsIgnoreCase("kazak")){
            toplamTutar+=adet*fiyat.get(urunler.indexOf("kazak"));
        } else if (urun.equalsIgnoreCase("etek")) {
            toplamTutar+=adet* fiyat.get(urunler.indexOf("etek"));
        } else if (urun.equalsIgnoreCase("gomlek")) {
            toplamTutar+=adet* fiyat.get(urunler.indexOf("gomlek"));
        } else if (urun.equalsIgnoreCase("pantolon")) {
            toplamTutar+=adet* fiyat.get(urunler.indexOf("pantolon"));
        } else if (urun.equalsIgnoreCase("ceket")) {
            toplamTutar+=adet* fiyat.get(urunler.indexOf("ceket"));
        }
        return toplamTutar;

    }


}
