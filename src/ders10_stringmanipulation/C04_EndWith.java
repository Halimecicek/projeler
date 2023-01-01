package ders10_stringmanipulation;

public class C04_EndWith {
    public static void main(String[] args) {
     String str="java her yerde guzel";
        System.out.println(str.endsWith("guzel"));
        System.out.println(str.endsWith(""));
        System.out.println(str.endsWith("java her yerde guzel"));
        System.out.println(str.endsWith("java"));
    }
}
