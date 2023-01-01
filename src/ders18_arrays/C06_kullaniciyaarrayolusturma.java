package ders18_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_kullaniciyaarrayolusturma {
    public static void main(String[] args) {
        // kullanicidan
        // ve elementleri alip array olusturan
        // ve bic=ze donduren bir method olusturma
        int[] kullaniciarrayi  = arrayolustur();
        System.out.println(Arrays.toString(kullaniciarrayi));

    }
    public static int[]arrayolustur(){
        Scanner scan = new Scanner(System.in);
        System.out.println("olusturulacak array in boyutunu giriniz");
        int length = scan.nextInt();
        int[] kullaniciarrayi = new int[length];
        for (int i = 0; i <length ; i++) {
            System.out.println("array e eklenecek bir sayi giriniz");
            kullaniciarrayi[i]= scan.nextInt();
        }
        return  kullaniciarrayi;
    }
}
