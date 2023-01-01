package ders06_if_elssteemant;

public class C10_ifelseifstatment {
    public static void main(String[] args) {
        // kullanicidan cinsiyetini ve yasini alin kadin 60 yas ve uzeri
        // erkek 65  yas ve uzeri emekli olabilir
        // cinsiyet ve yasini dikkate alarak
        // emekli olabilirsin veya emekli olmak icin yil daha calisman gerekir yazdirin

        char cinsiyet='E';
        int yas=60;
        if (cinsiyet=='E'&& yas>65){
            System.out.println("emekli olabilirsin");
        }else if (cinsiyet=='E'&& yas<65 && yas>15){
            System.out.println("emekli olmak icin daha "+ (65-yas)+"sene calismalisin");
        }else if (cinsiyet=='K'&& yas>=60){
            System.out.println("emekli olabilirsin");
        } else if (cinsiyet=='K'&& yas<60 && yas>1) {
            System.out.println("emekli olmak icin daha"+ (60-yas) +"sene calismalisin");
        }else{
            System.out.println("gecersiz giris");
        }
    }
}
