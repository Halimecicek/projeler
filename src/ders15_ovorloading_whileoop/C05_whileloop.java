package ders15_ovorloading_whileoop;

import java.util.Scanner;

public class C05_whileloop {
    public static void main(String[] args) {
        /* kullanicidan toplanmak uzere sayi alin sayilarin toplami 500 e esit olursa veya gecerse
        girilen sayi adedi  girilen sayilarin toplami ve
        bu kadar yeter yazdirin
         */

        Scanner scan = new Scanner(System.in);
        int grilensayi=0;
        int toplam=0;
        int sayac=0;
        while (toplam<500){

            System.out.println("lutfen bir sayi girin");
            grilensayi=scan.nextInt();
            toplam+=grilensayi;
            sayac++;

        }

        System.out.println("girilen "+sayac+"sayini toplami :"+toplam+"oldu.bu kadar yeter");
    }
}
