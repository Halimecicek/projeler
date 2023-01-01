package ders11_stringmanipualition;

public class C05_repaittrim {
    public static void main(String[] args) {
        String str= "java guzeldir ";

        System.out.println(str.repeat(4));
        str="   java guzeldir   ";
        System.out.println(str.length());

        str=str.trim();

        System.out.println(str);
        System.out.println(str.length());
    }
}
