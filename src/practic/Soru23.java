package practic;

import java.util.Scanner;

public class Soru23 {
    public static void main(String[] args) {
         /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz

*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();
        uzunlukDonusturenMethod(sayi);
    }
    public static void uzunlukDonusturenMethod(double sayi){
        double metre=sayi/100;
        double km=sayi/100000;
        System.out.println("metre"+metre+"\nkilometre"+km);
    }


}
