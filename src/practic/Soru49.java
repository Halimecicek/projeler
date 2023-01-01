package practic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru49 {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("listenin uzunlugunu giriniz");
        int listeSize = scan.nextInt();
        List<Integer> sayilar = new ArrayList<>();
        System.out.println("listeye eklemek icin sayi giriniz");
        int sayi = scan.nextInt();


        for (int i = 0; i < listeSize; i++) {
            sayilar.add(scan.nextInt());
        }
        System.out.println(sayilar);
        tekrarliEleman(sayilar);
    }

    private static void tekrarliEleman(List<Integer> sayilar) {
            List<Integer>tekrarliList = new ArrayList<>();
            for (int i = 0; i < sayilar.size(); i++){ //ilk listem
                for (int j = i+1; j <sayilar.size(); j++){ //diger indexleri karislastiracak
                    if(sayilar.get(i) == sayilar.get(j) && !tekrarliList.contains(sayilar.get(i))){
                        tekrarliList.add(sayilar.get(i));
                    }
                }
            }
            System.out.println("tekrarli listenin elemanlari :" + tekrarliList);
        }

    }


