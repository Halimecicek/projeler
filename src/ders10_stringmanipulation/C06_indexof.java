package ders10_stringmanipulation;

public class C06_indexof {
    public static void main(String[] args) {

        String str = "Ahmet hoca ile hersey clear";
        System.out.println(str.indexOf("a")); // 9 ilk a nin index ini doldurur
        System.out.println(str.indexOf("hersey"));
        System.out.println(str.indexOf("e", 9));
        // 13. indeksteki e den sonraki e yi bulalim

        System.out.println(str.indexOf("e", 14));
        System.out.println(str.indexOf("ali"));
        // cumledeki 2.c'nin index'ini yazdirin
        int ilkcindex = str.indexOf("c"); // 8
        System.out.println(str.indexOf("c", ilkcindex + 1)); // 22
        System.out.println(str.indexOf("ali")); // -1 index olarak int dondurmesi bekleniyor
        System.out.println(str.indexOf("x")); // -1
    }
}
