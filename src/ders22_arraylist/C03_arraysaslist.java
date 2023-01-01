package ders22_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_arraysaslist {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3};


        List<Integer>arraydenList= Arrays.asList(arr);
        System.out.println(arraydenList);
        // bu yontemin 2 negatif yani vardir
        // bu sekilde olusturulan listler esnek uzunluga sahip degillerdir
        // add remove gibi ozellikleri kullanmak isterseniz runtimeexception
        // bu yontem kaynak olan array ile yeni olusturulan
        // list ibirbirine baglar birinde yaptiginiz degisikligi otomatik olarak digerine de yansitir
        System.out.println("array :"+Arrays.toString(arr));
        System.out.println("liste:"+arraydenList);
        // sadece bir array elemanini degistirin
        arr[0]=10;
        System.out.println();
        System.out.println();

    }
}
