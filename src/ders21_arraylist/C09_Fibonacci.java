package ders21_arraylist;

import java.util.Scanner;

public class C09_Fibonacci {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir tamsayi alip,
        //  o tamsayidan kucuk Fibonacci sayilarini bir liste olarak kaydedin ve yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz ");
        int girilensayi= scan.nextInt();

        if (girilensayi<2){
            System.out.println("");
        }
    }
}
