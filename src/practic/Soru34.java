package practic;

import java.util.Scanner;

public class Soru34 {
    public static void main(String[] args) {
        /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/

        Scanner scan = new Scanner(System.in);
        String kelime="";

        do {
            System.out.println("lutfen bir kelime giriniz");
            kelime= scan.nextLine();
            if (kelime.length()<3){
                System.out.println("kelime 3 harften az");
            }
            if (kelime.length()%2==1 && kelime.length()>=3){
                System.out.println(kelime.substring(kelime.length()/2,kelime.length()/2+1));
            }else {
                System.out.println("yanlis kelime");
            }
        }while (!(kelime.length()%2==1 && kelime.length()>=3));





    }

}
