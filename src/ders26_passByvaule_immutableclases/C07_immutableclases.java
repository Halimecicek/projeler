package ders26_passByvaule_immutableclases;

public class C07_immutableclases {
    public static void main(String[] args) {
        String str= "Java Candir";
        str=str.toUpperCase();
        System.out.println(str);
    }
}
/*
        Immutable class'lardan olusturulan bir objenin degeri DEGISTIRILEMEZ
        Eger atama yaparsak java degerini degistirmez
        bunun yerine yeni bir obje olusturur,
        ve bu yeni objeye yeni atadiginiz degeri atar
        eski obje bosa cikar ve garbage collector tarafindan silinmeyi bekler
         */