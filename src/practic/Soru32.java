package practic;

public class Soru32 {
    public static void main(String[] args) {
        /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
       */

        int sayi=23;


        while(sayi>0){
            if(!(sayi%2==0)){
                System.out.println(sayi);
            }

            --sayi;

        }

    }
}
