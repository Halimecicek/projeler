package ders09_stringmanipulasions;

public class C07_substring {
    public static void main(String[] args) {

        String str="java gun gectikce guzellesiyor";
        str.substring(5,8);
        System.out.println(str.substring(5,8)); // gun
        // 5. indeksten baslar 3 tane karakter yazdirir
        //  5. index dahil 8. indeks haric yazdirir

        // gectikce yazdirin
        System.out.println(str .substring(9,17));
        System.out.println(str.substring(3,7));
        String isim="HASAN";
        // Verilen ismi ilk harf buyuk geriye kalanlar kucuk
        isim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase();
        System.out.println(isim);

        // sadece 3. harfi yazdirin
        System.out.println(isim.substring(3,4));

        System.out.println(isim.substring(2,2)); // hiclik olur konsolda birsey gorunmez


    }
}
