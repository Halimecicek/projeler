package ders08_ternary_switch;

public class C04_ternary {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin

        int sayi1=10;
        int sayi2=12;
        int sayi3=10;
        System.out.println(sayi1==sayi2 && sayi2==sayi3 ? "eskenar ucgen": "eskenar ucgen degil");

        // kullanicidan iki sayi alin buyuk olmayani yazdirin
        int s1=10;
        int s2=11;
        System.out.println(s1>s2 ? s2 : s1 );
    }
}
