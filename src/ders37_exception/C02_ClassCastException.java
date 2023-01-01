package ders37_exception;

import java.util.Objects;

public class C02_ClassCastException {
    public static void main(String[] args) {
        short sayi1=123;
        int sayi2=sayi1;

        short sayi3=24;
      //  Integer sayi4= sayi3;  Integer ve short arasinda parent child iliskisi olmadigindan birbirine atama yapilmaz

        short obj=sayi3;
        System.out.println("short dan objeye cast edince :"+obj);

      // Integer sayi5=(Integer)obj;

       // System.out.println("short deteyi obje uzerinde Integer e cast edince  :"+sayi5);


    }
}
