package ders29_stringbuilder_acsessmodifier;

public class C02_stringbuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("java candir");
        System.out.println(sb1.reverse());
        System.out.println("tersini yazdirdiktan sonra sb1:" +sb1);
        System.out.println(sb1.insert(0, "."));
        System.out.println(sb1);
        sb1.reverse();

        StringBuilder sb2=new StringBuilder("java candir");
        String str="java candir";
        System.out.println(sb1==sb2);
        System.out.println(sb1==sb1);
      //  System.out.println(sb1==str); farkli iki data turu ile karsilastirilamaz
        System.out.println(sb1.equals(sb2)); // icerik ayni olsa da false doner
        System.out.println(sb1.equals(str)); //cte vermez ama sonuc her zaman false doner

        System.out.println(sb1.compareTo(sb2));
        StringBuilder sb3=new StringBuilder("tava candir");
        System.out.println(sb1.compareTo(sb3));

        // compare to sadece tamamen ayni mi yoksa farkli mi sorusunun cevabini verir tamamen ayni ise ==> 0 doner
        // farklilik varsa ==> ilk farkli harfi buldugunda , farkli harflerin arasinda kac harf oldugunu verir

    }
}
