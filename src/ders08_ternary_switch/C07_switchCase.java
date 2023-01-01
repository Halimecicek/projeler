package ders08_ternary_switch;

import java.util.Scanner;

public class C07_switchCase {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir harf girin");
        char harf=scan.next().charAt(0);

        switch (harf){

            case 'J':
            case 'j':
                System.out.println("java");
            break;
            case 'D':
            case 'd':
                System.out.println("devolepment");
            break;
            case 'K':
            case 'k':
                System.out.println("Kit");
            break;
            default:
                System.out.println("Gecersiz harf");
        }




        }

    }
    // J : Java
    // D :
    // K :
    // KULLANICIDAN bir harf alin
    // alinan harf j, d k dan biri ise yukaridaki kelimeleri yazdirin
    // bu harflerden biri degilse " gecersiz harf" yazdirin





