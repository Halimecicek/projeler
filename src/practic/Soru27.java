package practic;

public class Soru27 {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.


        for (int i = 0; i <=255 ; i++) {
            char karakter=(char)i;
            System.out.print(i+" "+karakter);


        }
        System.out.println("====================while ile cozum ====================");

        int i=0;

        while(i<=255){
           char cracter=(char) i;
            System.out.print(i+"-"+cracter+" ");
            i++;

        }
    }
}
