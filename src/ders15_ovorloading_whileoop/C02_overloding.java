package ders15_ovorloading_whileoop;

public class C02_overloding {
    public static void main(String[] args) {

        carpim(3,5); // method call sirasinda method parantezine yazilanlara argument denir
        carpim(3.4,2); // double - Integer iki sayinin carpimi: 6.8

    }
    // bir classs da ayni isim ve ayni signature sahip iki method olmaz
    public static void carpim(int sayi1, int sayi2){
        System.out.println("iki int sayinin carpimi:"+ sayi1*sayi2);
    }

    public static void carpim(int sayi3 ,int sayi4, int sayi5){
        System.out.println("iki int sayinin carpimi:"+sayi3*sayi4*sayi5);
    }
    public  static void carpim(double sayi1, int sayi2){ // carpim double int
        System.out.println("double - Integer iki sayinin carpimi: "+sayi1*sayi2);
    }
    public static void carpim(int sayi1, double sayi2){ // carpim int double
        System.out.println("integer-double iki sayinin carpimi: "+sayi1*sayi2);
    }
    public static void carpim(double sayi1, double sayi2){ // carpim double double
        System.out.println("Iki double sayinin carpimi: "+sayi1*sayi2);
    }
}
