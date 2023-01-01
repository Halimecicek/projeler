package ders05_concatenation_ope;

public class c02_logicaloperators {
    public static void main(String[] args) {

        int a=20;
        int b=30;

        System.out.println(a>b && b>0 && a>0); // false

        boolean sonuc= 3*a <= 2*b && a>10 && b>20;

        System.out.println(sonuc);

        int c=25;
        int d=15;

        System.out.println(c>d && c>10 && c<0 );

        boolean s= 2*d <= 2*d && c>10 && d>20;
        System.out.println(s);


    }
}
