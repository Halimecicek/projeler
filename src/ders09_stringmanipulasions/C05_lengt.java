package ders09_stringmanipulasions;

public class C05_lengt {
    public static void main(String[] args) {

        String str= "uzunkavaklaraltindayataruyumazoglu";
        System.out.println(str.length());

        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.charAt(33));

        // sondan 3. karakteri yazdirin
        System.out.println(str.charAt(str.length()-3));
    }
}
