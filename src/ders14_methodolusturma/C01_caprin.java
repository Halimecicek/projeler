package ders14_methodolusturma;

import java.util.Scanner;

public class C01_caprin {

    public static void main(String[] args) {
        // main method icreisinde kullanicidan iki sayi alin
        // bu iki sayiyi parametre

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi girin");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println(carpimmetodu(sayi1, sayi2));// 17.0

        double carpimsonuc=carpimmetodu(6,2);
    }

    public static double carpimmetodu(double sayi1, double sayi2){
        System.out.println("carpim method u calisti");
        return sayi1*sayi2;
    }


}
