package ders14_methodolusturma;

public class C04_tekrar {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        // bu iki sayinin carpim sonucunu yeni kod yazidan konsolo yazdirin
        System.out.println(C01_caprin.carpimmetodu(a,b));

        String c= "nasil";
        String d=  "yani";

        System.out.println(C02_stringconcate.birlestirmetodu(c,d));

        String e= "buda mi oldu?";
        System.out.println(C03_stringterscevirme.stringitersecevir(e));

        // bu cunleyi terse cevir

        System.out.println(C03_stringterscevirme.stringitersecevir("bu cumleyi terse cevir"));

    }

}
