package practic;

public class Soru39 {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * lari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output:4
*/

        int[]arr={1,2,3,4,5,6,7};
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            toplam+=arr[i];

        }
        System.out.println(toplam/arr.length);
    }
}
