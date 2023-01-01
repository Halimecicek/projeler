package practic;

public class Soru36 {
    public static void main(String[] args) {
        // Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için
        //kod yazınız

        char harf= 'C';
        String harfler ="";

        do {
            harfler=harfler+harf;
            harf--;


        }while (harf>='a');
        System.out.println(harfler);





    }
}
