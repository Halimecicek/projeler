package ders13_nesdedforlop_methodolusturma;

public class C05_nestedforloopucgen {
    public static void main(String[] args) {
        /*
        nested forloop kullanarak asagidaki sekli yapin
        1
        12
        123
        1234
        12345
         */
        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println("");
        }
    }
}
