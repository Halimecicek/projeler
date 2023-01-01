package ders10_stringmanipulation;

public class C08_lastindexof {
    public static void main(String[] args) {
        String str="java hafifden beyin yakiyor";

        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.lastIndexOf('e'));
        System.out.println(str.lastIndexOf("java"));
        System.out.println(str.lastIndexOf("Java"));
        System.out.println(str.lastIndexOf("e",14)); // 14 . den sonraki ilk e yi bulur


    }
}
