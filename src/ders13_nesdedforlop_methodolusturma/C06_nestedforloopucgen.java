package ders13_nesdedforlop_methodolusturma;

public class C06_nestedforloopucgen {
    public static void main(String[] args) {


        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
    }
}
