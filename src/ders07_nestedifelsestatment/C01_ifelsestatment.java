package ders07_nestedifelsestatment;

import java.util.Scanner;

public class C01_ifelsestatment {
    public static void main(String[] args) {
        // kullanicidan kilosunu ve boyunu isteyin
        // vucut kitle endeksi 30 dan buyukse obez
        // 25-30 arasi ise kilolu
        // 20-25 arasi ise normal
        // 20 den kucukse zayif yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kg olarak kilonuzu girin");
        double agirlik= scan.nextDouble();
        System.out.println("lutfen cm olarak boyunuzu girin" );
        double boy= scan.nextDouble();

        double vke= (agirlik * 10000/ (boy*boy));
        System.out.println("vucut kitle endeksi:"+ vke);

        if (vke> 30) {
            System.out.println("obez");
        }else if (vke>25){
            System.out.println("kilolu");
        } else if (vke>20){
            System.out.println("normal");
        }else if (vke>0){
            System.out.println("zayif");
        }else{
            System.out.println("yanlis giris");
        }
    }
}
