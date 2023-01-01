package ders20_multidimensinoalarrays;

public class C06_MDA_Soru {
    public static void main(String[] args) {
        // Verilen 2 katli bir array’de her bir inner array’in son
        // elementlerinin toplaminini yazdiran bir method olusturun.
        int[][] arr={{5,7}, {5, 8, 9},{0,1}};

        sonelementleritoplama(arr);
    }
    public static void sonelementleritoplama(int[][]arr){
        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i][arr[i].length-1];

        }
        System.out.println("inner arraylerin son elementlerinin toplami :"+toplam);
    }
}
