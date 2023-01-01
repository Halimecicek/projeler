package ders15_ovorloading_whileoop;

public class C01_overloading {
    public static void main(String[] args) {
        String str="java ogrendik ,siradaki gelsin";

        System.out.println(str.startsWith("a",3));
    }
}

        /*
          Bir class'da ayni isimde ama farkli signature'a sahip method'lar olusturulmasina
          method overloading denir.
         */