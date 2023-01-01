package ders02dataturleriscanner;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {

        //kullanicidan ismini alip , buyuk harflerle yazdirin
       Scanner scan =new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz");

        String kullaniciadi= scan.next();
        System.out.println(kullaniciadi.toUpperCase());


    }
}
