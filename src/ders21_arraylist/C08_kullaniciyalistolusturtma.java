package ders21_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_kullaniciyalistolusturtma {
    public static void main(String[] args) {
        // Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi
        // isimleri bize liste olarak dondurecek bir method olusturun.

        System.out.println(listeolustur());

    }
    public static List<String> listeolustur(){
        List<String> isimler= new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String girilenisim="";
        while (!girilenisim.equalsIgnoreCase("q")){
            System.out.println("lutfen listeye eklemek icin isim giriniz"+"\n bitirmek icin q ya basin");
            girilenisim=scan.nextLine();
            if (!girilenisim.equalsIgnoreCase("q")){
                isimler.add(girilenisim);

            }
        }
      return isimler;

    }
}
