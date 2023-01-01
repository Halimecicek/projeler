package ders10_stringmanipulation;

public class C01_concatenation {
    public static void main(String[] args) {
         String str1="java";
         String str2="guzeldir";
         boolean bl= true;
         int sayi=20;
         double dbl=3.54;
        System.out.println(str1+bl+sayi);

        System.out.println(sayi + dbl); // 23.54
        // System.out.println(str1.concat(bl));
        // concat() sadece String variable'lari birlestirmek icin kullanilir
        System.out.println(str1.concat(" ").concat(str2)); // Java Guzeldir
        // string disindaki data turlerinde toplama yapmaniza izin vermeyebilir
       //  System.out.println(str1.concat(bl));
    }
}
