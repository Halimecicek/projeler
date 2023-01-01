package ders43_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {
        // verilen bir array in tekrar eden elementleri silip elementler bir kez yazilsin

        int [] arr={6,7,4,2,3,4,5,6,7,5,3,5,4,4,2,1,3,1,1,5,7};
        Set<Integer> geciciSet=new HashSet<>();
        for (Integer each:arr
             ) {
            geciciSet.add(each);
        }
        int [] geciciArr=new int[geciciSet.size()];
        int index=0;

        for (Integer  each:geciciSet
             ) {
            geciciArr[index]=each;
            index++;
        }

        // tekrarsiz degerleri gecici arr ye tasidik simdi kendi arr mize bu gecici arr yi atayalim
        arr=geciciArr;
        System.out.println(Arrays.toString(arr));
    }
}
