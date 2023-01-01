package ders19_arrays;

import java.util.Arrays;

public class C08_arrayaelemaneklememethodu {
    public static void main(String[] args) {
        // verilen bir int array e istenen bir elementi ekleyin
        //

        int[] abc= {3,5,8,9 };
        int ekleneceksayi=1;

        abc=arrayelemanekle(abc,ekleneceksayi);
        System.out.println(Arrays.toString(abc));
    }
    public static int[] arrayelemanekle(int[]eklenecekarr, int ekleneceksayi){
        int[] yeniarr= new int [eklenecekarr.length+1];
        for (int i = 0; i <eklenecekarr.length ; i++) {
            yeniarr[i]=eklenecekarr[i];


        }
        yeniarr[yeniarr.length-1]=ekleneceksayi;
        return yeniarr;

    }
}
