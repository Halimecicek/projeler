package practic;

import java.util.Scanner;

public class Soru33 {
    public static void main(String[] args) {
        /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.

*/
        Scanner scan= new Scanner(System.in);
        System.out.println("programı çalıştırmak için bir kelime giriniz\n bitirmek için x e basınız");
        String kelime=scan.nextLine();

        do {
            System.out.println("program çalışıyor");
            kelime=scan.nextLine();
        }while (!kelime.equalsIgnoreCase("x"));

        System.out.println("program bitti");

        scan.close();
    }
}
