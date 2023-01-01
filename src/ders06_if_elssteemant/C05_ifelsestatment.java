package ders06_if_elssteemant;

import java.util.Scanner;

public class C05_ifelsestatment {
    public static void main(String[] args) {
        // kulanicidan yasini isteyin
        // 65 yas ve uzeri ise emekli olabilirsin yazdirin
        //yoksa emekli olmasi icin calismasi gereken yili yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        double yas= scan.nextInt();

        if(yas>65) {
            System.out.println("yasiniz emekli olmak icin yeterli");
        }else
            {
                System.out.println("emekli olmak icin "+(65-yas)+ "sene daha calismalisin");
        }
    }
}
