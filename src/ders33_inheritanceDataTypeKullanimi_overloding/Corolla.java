package ders33_inheritanceDataTypeKullanimi_overloding;

public class Corolla extends BToyota{
    String model="COROLLA";
    String uretimYeri="turkiye";
    int yil=2023;
    /*
    bir obje olusturuken data turu ve consructor ayni class
     ise bir variablenin degerini bulmak icin o class a gideriz
     o class da yoksa siraayla parent classlara bakilir
     ilk bulunan kullanilir
     */


    public static void main(String[] args) {

        Corolla corolla1=new Corolla();
        System.out.println(corolla1.model);
        System.out.println(corolla1.uretimYeri);
        System.out.println(corolla1.yil);
        System.out.println(corolla1.marka);
        System.out.println(corolla1.motor);
        System.out.println(corolla1.plaka);
        System.out.println(corolla1.yakit);

        BToyota corolla2 =new Corolla();
        System.out.println(corolla2.model);
        //System.out.println(corolla2.uretimYeri);
        System.out.println(corolla2.yil);
        System.out.println(corolla2.marka);
        System.out.println(corolla2.motor);
        System.out.println(corolla2.plaka);
        System.out.println(corolla2.yakit);

        /*
        obje olusturulurken data turu consractor farkli
        ise variable nin degerini bulmak icin
        data turu olan class a gidilir varsa kullanir
        yoksa class in paraentlerine
        bakilir bulamaz ise cte verir (ama geri vites yapmaz )
         */

        Araba corolla3=new Corolla();
       // System.out.println(corolla3.model);
        // System.out.println(corolla3.uretimYeri);
       // System.out.println(corolla3.yil);
       // System.out.println(corolla3.marka);
        System.out.println(corolla3.motor);
        System.out.println(corolla3.plaka);
        System.out.println(corolla3.yakit);

        BToyota toyota1=new BToyota();
        System.out.println(toyota1.marka);
        System.out.println(toyota1.model);
        System.out.println(toyota1.motor);
        System.out.println(toyota1.plaka);
        System.out.println(toyota1.yil);
        System.out.println(toyota1.yakit);

        Araba toyota2=new BToyota();
        //System.out.println(toyota2.marka);
        //System.out.println(toyota2.model);
        System.out.println(toyota2.motor);
        System.out.println(toyota2.plaka);
       // System.out.println(toyota2.yil);
        System.out.println(toyota2.yakit);

        Araba araba=new Araba ();
        System.out.println(araba.motor);
        System.out.println(araba.plaka);
        System.out.println(araba.yakit);
    }
}
