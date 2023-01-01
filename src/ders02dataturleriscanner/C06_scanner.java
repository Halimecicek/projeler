package ders02dataturleriscanner;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {

        // kullanicidan bir dikdortgenin iki kenar uzunlugunu alip ,
        // dikdortgenin alanini yazdirin

        Scanner scan = new Scanner (System.in);
        System.out.println("lutfen dikdortgenin iki kenar uzunlugunu girin"+
                "iki kenar uzunlugu arasinda enter e basin ");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        System.out.println("dikdortgenin alani :"+kenar1*kenar2);


    }
}
