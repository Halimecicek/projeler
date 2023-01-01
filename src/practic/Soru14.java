package practic;

import java.util.Scanner;

public class Soru14 {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen adinizi ve soyadinizi girin");
        String isim = scan.nextLine();

        System.out.println(isim.toUpperCase());

    }
}
