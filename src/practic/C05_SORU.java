package practic;

import java.util.Scanner;

public class C05_SORU {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */


        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen cumle olusturmak icin 4 kelime giriniz");
        String kelime1= scan.nextLine();
        String kelime2= scan.nextLine();
        String kelime3= scan.nextLine();
        String kelime4= scan.nextLine();
        System.out.println(kelime1+ kelime2+ kelime3+ kelime4+ ".");

    }
}
