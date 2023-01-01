package ders06_if_elssteemant;

import java.util.Scanner;

public class C08_ifelseifstatment {
    public static void main(String[] args) {
        // kulanicidan bir ucgenin 3 kenar uzunlugunu alin
        // ucgen eskenar ise eskenar ucgen yazdirin degilse  eskenar degil yazdirin
        // kenar uzunluklari 0 veya negatifse gecersiz kenar uzunlugu yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen ucgenin 3 kenarini giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if(kenar1<=0 || kenar2<=0 || kenar3<=0){
            System.out.println("gecersiz kenar uzunlugu");
        }else if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("eskenar ucgen");
        } else{
            System.out.println("eskenar ucgen degil");
        }

    }
}
