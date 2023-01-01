package ders06_if_elssteemant;

import java.util.Scanner;

public class C03_ifelsestatment {
    public static void main(String[] args) {
        //  kullanicidan bir ucgenin 3 kenar uzunlugunu alin
        // ucgen eskenar ucgen ise yazdirin degilse eskenar ucgen degil yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen ucgenin 3 kenarini giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();
        if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("eskenar ucgen");
        } else {
        System.out.println("eskenar ucgen degil");}
    }
}
