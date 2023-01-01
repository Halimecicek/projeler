package ders43_collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {
    public static void main(String[] args) {
        Set<Integer> sayilar=new HashSet<>();
        sayilar.add(12);
        sayilar.add(15);

        Set<Integer>siraliset=new TreeSet<>();
        siraliset.add(23);
        siraliset.add(34);
        siraliset.addAll(sayilar);


        System.out.println(siraliset);
    }
}
