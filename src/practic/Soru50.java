package practic;

import java.util.Arrays;

public class Soru50 {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
*/
        int sayi=2;
        int []arr={1,2,3,4,5,6,7,8};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]+" "+arr[arr.length-1]);


    }
}
