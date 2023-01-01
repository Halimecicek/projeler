package ders05_concatenation_ope;

public class c01_concation {
    public static void main(String[] args) {
        // sadece asagida verilen vareableleri kullanarak  istenen degerleri yazin

        String s1= "java";
        String s2="guzeldir";
        String s3= ""; // hiclik
        String s4=" "; // space bosluk

        int sayi1=4;
        int sayi2=3;

        // java guzeldir7

        System.out.println(s1+s4+s2+(sayi1+sayi2));

        // javaguzeldir 12

        System.out.println(s1+s4+s2+s4+(sayi1*sayi2));

        //7java guzeldir

        System.out.println(sayi1+sayi2+s1+s4+s2);
        //34 java
        System.out.println(s3+sayi1+sayi2+s4+s1);

        //java guzeldir7 12

        System.out.println(s1+s4+s2+(sayi1+sayi2)+s4+(sayi1*sayi2));

    }
}
