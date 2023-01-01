package ders21_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C05_set {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        // list.set(index, yenideger) method u
        // istenen indexdeki eski degeri silip bize dondurur
        // ve o indexdeki

        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
            // javada setbu update icin kullanilir
            // add() ile set) farklidir


        }

        System.out.println(sayilar.set(0, 8));
        int eskiDeger= sayilar.set(1,9);

        System.out.println(eskiDeger);

        System.out.println(sayilar);
    }
}
