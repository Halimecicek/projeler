package practic;

import java.util.Scanner;

public class sifre {
    public static void main(String[] args) {
        // / kullanıcıdan bir sifre isteyin
        //        //*sifre en az 10 haneli olmalı *sifre buyuk harf icermeli *sifrede rakam bulunmalı
        //        // olusturulan sifre yukarıdaki sartlara uygunsa uygundur yazdir.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sifre giriniz");
        String sifre="grryyjggd";
        int bayrak = 0;
        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk harf olmali");
            bayrak++;
        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("Son karakter rakam olmali");
            bayrak++;
        }
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            bayrak++;
        }
        if (!(sifre.length()>=10)){
            System.out.println("Sifre en az 10 haneli olmali");
            bayrak++;
        }
        if (bayrak==0){
            System.out.println("sifreniz basari ile kaydedildi");
        }

    }
}