package practic;

import java.util.Scanner;

public class Soru42 {
     /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
*/
     public static void main(String[] args) {
         int[]arr=new int[8];
         Scanner scan =new Scanner(System.in);
         for (int i = 0; i <arr.length ; i++) {
             System.out.println(i + "indexdeki sayiyi giriniz:");
             arr[i]= scan.nextInt();
         }
         int bayrak=0;
         for (int i = 0; i < arr.length ; i++) {
             if (arr[i]%3==0){
                 bayrak++;
             }
         }
         System.out.println( "3 e bolunenlerin toplami :"+bayrak);

     }
}
