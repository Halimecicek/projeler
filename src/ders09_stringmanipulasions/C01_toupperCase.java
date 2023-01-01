package ders09_stringmanipulasions;

public class C01_toupperCase {
    public static void main(String[] args) {

        String str ="java Mutluluktur";
        System.out.println(str.toUpperCase());
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);

        str="ince mehmet";
        str=str.toUpperCase();
        System.out.println(str);
    }
}
