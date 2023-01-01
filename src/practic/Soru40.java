package practic;

import java.util.Arrays;

public class Soru40 {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
      *
*/

        String [] arr1={"heySiri"};
        String[] arr2={"ByeSiri"};
        arr1=arr2;
        System.out.println(Arrays.toString(arr1));


    }
}
