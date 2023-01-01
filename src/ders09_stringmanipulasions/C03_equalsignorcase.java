package ders09_stringmanipulasions;

public class C03_equalsignorcase {
    public static void main(String[] args) {

        String str1="Ali";
        String str2= "ali";
        String str3= "ALI";

        System.out.println(str1.equals(str2)); // false  equals ise birebir ayni olacak ki dogru kabul etsin yoksa etmez

        System.out.println(str1.equalsIgnoreCase(str2)); // true  equalsignorcase metin olarak ayni
           // ama buyuk  harf kucuk harf fark etmez dogru kabul eder or; a li ile ali ayni degildir kabul etmez

    }
}
