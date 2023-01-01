package ders06_if_elssteemant;

import java.util.Scanner;

public class C01_ifstaetment {
    public static void main(String[] args) {
        // kullanicidan bir harf alin harf ile baslayan bir ay varsa yazdirin
       // buyuk kucuk harf hassasiyeti olmasin
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ay isminin ilk harfini girin");
        char ilkharf= scan.next().charAt(0);

        if (ilkharf=='o'|| ilkharf=='o'){
            System.out.println("ocak");}
        if (ilkharf=='s'|| ilkharf=='s'){
            System.out.println("subat");}
        if (ilkharf=='m'|| ilkharf=='m'){
            System.out.println("mart veya mayis");}
        if (ilkharf=='n'|| ilkharf=='n'){
            System.out.println("nisan");}
        if (ilkharf=='h'|| ilkharf=='h'){
            System.out.println("haziran");}
        if (ilkharf=='t'|| ilkharf=='t'){
            System.out.println("temmuz");}
        if (ilkharf=='a'|| ilkharf=='a'){
            System.out.println("agustos veya aralik");}
        if (ilkharf=='e'|| ilkharf=='e'){
            System.out.println("eylul veya ekim");}
        if (ilkharf=='k'|| ilkharf=='k'){
            System.out.println("kasim");
        }

    }
}
