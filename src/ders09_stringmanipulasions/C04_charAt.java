package ders09_stringmanipulasions;

public class C04_charAt {
    public static void main(String[] args) {

        String str1="java Candir";
        System.out.println(str1.charAt(0)); // ilk harfi verir
        System.out.println(str1.charAt(5)); // 5. karakteri  verir boslukta bir karakterdir ve 0 dan baslar
        System.out.println(str1.charAt(10));



        /*
          bir metindeki karakter sayisi ile son index arasinda 1 fark vardir
          bu metin icin  karakter sayisi 11
                         son index 10 dur.
         */
        // System.out.println(str.charAt(11)); // StringIndexOutOfBoundsException
    }
}
