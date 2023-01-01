package ders21_arraylist;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_Arraydentekrarlarisilme {
    public static void main(String[] args) {
         //
        //

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        // bu soruyu array le yapmak cok zor
        // bunun yerine bu arrayin elemanlarini tekrarsiz olanlari bir lisr=te atalim
        // en son o list teki elementleri iceren bir array deger olarak atalim

        List<Integer> tekrarsizliste= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            if (!tekrarsizliste.contains(arr[i])){
                tekrarsizliste.add(arr[i]);

            }

        }
        System.out.println("tekrarsiz liste :"+tekrarsizliste);
        arr=new int[tekrarsizliste.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tekrarsizliste.get(i);
        }
        // array istenen hale geldi
        System.out.println("Array'in tekrarsiz hali : "+ Arrays.toString(arr));
    }


    }

