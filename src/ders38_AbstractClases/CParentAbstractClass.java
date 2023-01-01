package ders38_AbstractClases;

public abstract class CParentAbstractClass {
    /*
    abstract bir class a abstract methodlara sahip olabilir
    bir class i abstract yapmak icin class declaretion abstract keyword eklenmelidir.

     */
    public abstract void mecburiMethod1();
     public abstract void mecburiMethod2();
     // soyut yani absract methodlarin body si olmaz

    public String concrateMethod(){
        return "";
        // bugune kadar kullandigimiz normal methodlara
        //
    }

    }

    /*
    bir parent class child classlarin mutlaka ovirrede edecegi bir method olusturdugumuzda method bodysi gereksizlesir
    cunku hic calismayacaktir
     */



    /*
    1- abstract paren classdan olusturulmayacagi icin objeler icin bu method kullanilmaz
    2- child class larda mecburen  bu methodu ovirride edeceklerinden bu methodlarin body si asla kullanilmayacaktir
    java hic kullanilmayacak bu method body yazmamaya imkan tanimistir.


    child classlarin mutlaka ovirrede etmesini istedigimiz methodlari
    aabstract olarak tanimlar ve bodysiz olarak olustururuz
     */
