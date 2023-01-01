package practic;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
         /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolladacozunuz
*/
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        String sonuc= sayi==1?"one":sayi==2?"two":sayi==3?"three":sayi==4?"four":sayi==5?"five":
                sayi==6?"six":sayi==7?"seven":sayi==8?"eight":sayi==9?"nine":"gecersiz";
        System.out.println(sonuc);

    }
}
