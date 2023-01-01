package ders26_passByvaule_immutableclases;

import java.util.ArrayList;
import java.util.List;

public class C06_immutableclases {
    public static void main(String[] args) {
        String str= "Java guzeldir";
        System.out.println(str.toUpperCase());

        System.out.println(str);
        str.toLowerCase();
        System.out.println(str);
        // String immutable oldugu icin, method ile yapilan degisikler String'i kalici degistirmez

        List<String>harfler=new ArrayList<>();
        harfler.add("a");
        harfler.add("b");
        harfler.remove(0);
        System.out.println(harfler);
        // List ve Array mutable olduklari icin method ile yapilan degisiklikler kalici olur
    }
}
