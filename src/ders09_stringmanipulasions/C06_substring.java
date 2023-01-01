package ders09_stringmanipulasions;

public class C06_substring {
    public static void main(String[] args) {
        String str=  "java ogren isi kap";

        System.out.println(str.substring(5)); // ogren isi kap
        // ubstrıng ısı verılen degerden sonra kı metnın tumunu yazdırma
        System.out.println(str.substring(0)); // java ogren isi kap
        System.out.println(str.length()); // 18
        // son karakteri bulun
        String sonharf=""+str.charAt(str.length()-1);

        sonharf=str.substring(str.length()-1);
        System.out.println(sonharf);

        // son indeksteki karakteri upper case olarak yazdirin
        System.out.println();

        System.out.println(str.substring(str.length()-1).toUpperCase()); // P

        // son uc harfi buyuk harf yazdirin
        System.out.println(str.substring(str.length()-3).toUpperCase());

        System.out.println("----------------------------------");

        System.out.println(str.substring(7).toUpperCase());
        System.out.println(str.substring(0,(str.length()-1)/2));
    }
}
