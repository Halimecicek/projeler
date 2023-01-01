package practic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_practik {
    public static void main(String[] args) {

        System.out.println(listeolustur());
    }

    public static List<String> listeolustur(){
        List<String> isimler= new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String girilenisim= "";

        while (!girilenisim.equalsIgnoreCase("q")){
            System.out.println("lutfen isim giriniz "+"\n bitirmek icin q a basiniz");
            girilenisim=scan.nextLine();
            if (!girilenisim.equalsIgnoreCase("q")){
                isimler.add(girilenisim);

            }
        }
        return isimler;

    }
}
