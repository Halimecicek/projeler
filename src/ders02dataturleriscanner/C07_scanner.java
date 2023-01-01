package ders02dataturleriscanner;

import java.util.Scanner;

public class C07_scanner {
    public static void main(String[] args) {
        // kullanicinin adini soyadini yasini alip asagidaki formatta yazin
        // adi :
        //soyadi :
        //yasi:
        // kaydiniz basari ile tamamlanmistir

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen adinizi giriniz");
        String ad=scan.nextLine();

        System.out.println("lutfen soyadinizi giriniz");
        String soyad=scan.nextLine();

        System.out.println("lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        System.out.println("adiniz:"+ad+"\nsoyadiniz:"+soyad+"\nyasiniz:"+yas+"\nkaydiniz basariyla tamamlanmistir");






    }
}
