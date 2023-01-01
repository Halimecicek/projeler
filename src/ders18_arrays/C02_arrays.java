package ders18_arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {

        String [] arr= {"ali", "ulus", "nesrin"};

        for (int i = 0; i <arr.length ; i++) {

            System.out.println(arr[i]+"");

        }
        System.out.println("");

        System.out.println(arr);
        //array bir obje / nan - privitive data oldugundan
        // aray i array olarak yazdrmak isterseniz array clasindaki yardim olmalisin

        System.out.println (Arrays.toString(arr));
    }
}
