package ders26_passByvaule_immutableclases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_passbyvlauelist2 {
    public static void main(String[] args) {
        // bir method olusturalim
        // method da yeni bir liste olusturun
        // listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayn
        // ve sayilar listini yazdirin

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        listeyi5arttir(sayilar);
        System.out.println("method call dan sonra main method da sayilar list:"+sayilar);


    }

    public static void listeyi5arttir(List<Integer> sayilar) {
        List<Integer> yenilist= new ArrayList<>();
        for (int i = 0; i <sayilar.size() ; i++){
            yenilist.add(sayilar.get(i)+5);

        }
        sayilar=yenilist;
        System.out.println("method ");

    }
}