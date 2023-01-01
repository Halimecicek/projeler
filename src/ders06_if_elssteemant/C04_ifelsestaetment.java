package ders06_if_elssteemant;

import java.util.Scanner;

public class C04_ifelsestaetment {
    public static void main(String[] args) {
        // kullanicidan bir karakter girmesini isteyin
       // girilen karakterin buyuk harf olup olmadigini yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir karakter girin");
        char krk= scan.next().charAt(0);
        if (krk>='A'&& krk <='Z'){
            System.out.println("buyuk harf");
        }else{
            System.out.println("buyuk harf degil");
        }

    }
}
