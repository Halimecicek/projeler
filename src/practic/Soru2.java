package practic;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>59
*/
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        int not = scan.nextInt();
        if (not>=90 && not<=100){
            System.out.println();
        } else if (not>=80&&not<=89) {
            System.out.println();
        } else if (not>=70&&not<=79) {
            System.out.println();
        } else if (not>=60&&not<=69) {
            System.out.println();
        } else if (not>=59) {
            System.out.println();

        }else{
            System.out.println("hatali giris yaptiniz");
        }


    }
}
