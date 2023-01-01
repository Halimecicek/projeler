package practic;

import java.util.Scanner;

public class Soru20 {
    public static void main(String[] args) {
         /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kelime giriniz");
        String kelime = scan.nextLine();

        System.out.println(kelime.contains("xyz"));

    }
}
