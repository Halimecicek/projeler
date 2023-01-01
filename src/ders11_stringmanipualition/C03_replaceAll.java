package ders11_stringmanipualition;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str=  "J1ava2 g9uzel5dir8";

        // metindeki sayilari silip yazdirin

        System.out.println(str.replaceAll("\\d",""));

        String s1="ilk urun fiyati";
        String s2="ikinci urun fiyat";

        // iki urun fiyatini toplayin
        s1=s1.replaceAll("\\D","");
        s2=s2.replaceAll("\\D","");
        System.out.println(s1+s2);
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));


    }
}
