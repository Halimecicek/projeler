package practic;

import java.util.Scanner;

public class Soru19 {
    public static void main(String[] args) {
        /* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)
          ORNEK:          INPUT     OUTPUT
                          goat        gat
                         photo        hoto
                         ghost        ghost
                         kalem        lem
		*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kelime giriniz");
        String kelime = scan.nextLine();
        if(kelime.startsWith("gh")){
            System.out.println(kelime);
        } else if (kelime.startsWith("g")) {
            System.out.println(kelime.substring(0,1)+kelime.substring(2));
        } else if (kelime.substring(1,2).equals('h')) {
            System.out.println(kelime.substring(1));
        }else {
            System.out.println(kelime.substring(2));
        }
    }
}
