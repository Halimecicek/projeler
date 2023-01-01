package ders22_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ortalamaninustundekinotsayisi {
    public static void main(String[] args) {
        // ogretmende ogrenci notlarini alin bir list olusturun
        //  ogretmen 100 den buyuk sayi girip bitirdiginde  bitirdiginde
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

        List<Double> notlar = listeolustur();
        System.out.println(notlar);
        raporla(notlar);

    }
    public static void raporla(List<Double> notlar){
       //
       int ogrencisayisi=notlar.size();
       double notlartoplami=0.0;
       double sinifnotortalamasi=0.0;
       int ortalamaustundekiogrencisayisi=0;

       // notlar topalamini bulalim
        for (int i = 0; i <notlar.size() ; i++) {
            notlartoplami+=notlar.get(i);
            // not ortalamasini bulalim
            sinifnotortalamasi=notlartoplami/ogrencisayisi;
         //
        for (int j = 0; j <notlar.size() ; j++) {
            if (notlar.get(j)>sinifnotortalamasi){
                ortalamaustundekiogrencisayisi++;
            }

            }
            System.out.println("girilen not sayisi :"+ogrencisayisi+"\ngirilen not ortalamasi:"+sinifnotortalamasi);
        }


    }
    public static List<Double> listeolustur(){

        List<Double> notlar= new ArrayList<>();

        Scanner scan = new Scanner(System.in);

       Double girilennot=5.0;

        while (girilennot<=100){
            System.out.println("lutfen listeye eklemek icin not giriniz"+"\n bitirmek icin 100 den buyuk sayi giriniz");
            girilennot=scan.nextDouble();
            if (girilennot<=100){
                notlar.add(girilennot);

            }
        }
        return notlar;

    }
}
