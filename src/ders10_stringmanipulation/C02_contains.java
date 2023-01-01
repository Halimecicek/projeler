package ders10_stringmanipulation;

public class C02_contains {
    public static void main(String[] args) {
        String str= "Java ile kodlama cok zevkli";

        System.out.println(str.contains("cok")); // true

        System.out.println(str.contains("odla")); // true

        System.out.println(str.contains("a")); // true

        System.out.println(str.contains("java")); // false      kucuk j oldugu icin yanlis

        // System.out.println(str.contains('s'));  parametre olarak char kabul etmez

                // charsequence : char dizisi
        System.out.println(str.contains("J")); // true

    }
}
