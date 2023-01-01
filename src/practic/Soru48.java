package practic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Soru48 {
    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
*/

        List<String>isimler = new ArrayList<>();
        isimler.add("halime");
        isimler.add("sinem");
        isimler.add("edanur");
        isimler.add("miralp");
        isimler.add("osman asim");
        isimler.add("ali");
        isimler.add("umit");

        Scanner scan= new Scanner(System.in);
        System.out.println("kullanici adinizi giriniz");
        String isim= scan.nextLine().trim();
        if (isimler.contains(isim)){
            System.out.println("bu isim zaten kullanilmaktadir");
        }else{
            System.out.println("bu ismi kullanabilirsiniz");
        }
        if (isimler.contains(isim)){
            int randomsayi= new Random().nextInt(1000);
            isim=isim+randomsayi;
            System.out.println("isterseniz bu isimi kullanabilirsiz"+isim);
        }else{
            System.out.println("isminiz kaydedilmistir"+isim);
        }
    }
}
