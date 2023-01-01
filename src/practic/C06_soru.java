package practic;

import java.util.Scanner;

public class C06_soru {
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
        if(kelime.startsWith("gh"))
            System.out.println(kelime);

        System.out.println(kelime.substring(0,1));


    }
    }




