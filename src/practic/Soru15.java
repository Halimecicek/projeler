package practic;

import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen ilk kelime giriniz");

        String str1=scan.nextLine();
        String str2=scan.nextLine();
        System.out.println("lutfen ikinci kelimeyi giriniz");
        System.out.println(str1.concat(str2));
    }
}
