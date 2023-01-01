package practic;

import java.util.ArrayList;
import java.util.List;

public class C02_practic {

    public static void main(String[] args) {
        // Verilen String bir listede istenmeyen harf iceren elementleri silip,
        // kalan kismini list olarak bize donduren bir method olusturun


        List<String> isimler = new ArrayList<>();
        isimler.add("halime");
        isimler.add("edanur");
        isimler.add("miralp");
        isimler.add("umit");
        System.out.println(listeolustur(isimler));
    }

    public static List<String> listeolustur(List<String> isimler) {
        String istenmeyenharf="h";



        for (int i = 0; i < isimler.size(); i++) {
            isimler.remove(istenmeyenharf);

        }

        System.out.println(istenmeyenharf);
       return isimler;

    }
}