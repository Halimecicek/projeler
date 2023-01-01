package ders07_nestedifelsestatment;

public class C03_nestetifelsestaetment {
    public static void main(String[] args) {
        // kullanicidan cinsiyetini ve yasini alin kadin 60 yas ve uzeri
        // erkek 65  yas ve uzeri emekli olabilir
        // cinsiyet ve yasini dikkate alarak
        // emekli olabilirsin veya emekli olmak icin yil daha calisman gerekir yazdirin

        // nested if else seklinde kullanim icin once ana degiskeni secip
        // ona gore ana yapiyi olusturalim
        // cinsiyet ana degisken

        char cinsiyet= 'K';
        int yas=56;

        if (cinsiyet=='k'|| cinsiyet=='K'){
            // giris yapilan deger  bir kadina aittir
            if (yas<15) {
                System.out.println("hatali yas girisi");
            }else if (yas<60){
                System.out.println("emekli olamazsin "+(60-yas)+"yil calismalisin");
            }else{
                System.out.println("emekli olabilirsin");


            }  if (cinsiyet=='e' || cinsiyet== 'E') {
                // giris yapilan deger bir erkege aittir
                 }
                if (yas<15) {
                    System.out.println("hatali yas girisi");
                }else if (yas<65){
                    System.out.println("emekli olamazsin "+(65-yas)+"yil calismalisin");
                }else{
                    System.out.println("emekli olabilirsin"); {
                    }
            }
        }
    }
}
