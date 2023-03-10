package ders42_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_LinkedListSoru {
    public static void main(String[] args) {
        //Soru : Kullanicidan deger alarak iki String liste olusturun. Kullanici deger girmeyi birakmak icin 0’a basmalidir.
        // Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
        // liste1 : …….
        // liste2 : …….
        // ortak elementler : …….

        System.out.println("Once list1 i olusturalim");
        List<String>list1=kullanicidanAlarakListOlustur();
        System.out.println("Simdi ikinci listeyi olusturalim");
        List<String>list2=kullanicidanAlarakListOlustur();
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        list1.retainAll(list2);
        System.out.println("ortak elemanlar ="+ list1);


    }


    public static List<String>kullanicidanAlarakListOlustur(){

        List<String>isimlistesi=new LinkedList<>();

        Scanner scan =new Scanner(System.in);
        String isim="";

        while (!isim.equalsIgnoreCase("0")){
            System.out.println("listeye eklemek icin isim giriniz \nBitirmek icin 0 a basiniz ");
            isim=scan.nextLine();
            if(!isim.equalsIgnoreCase("0")){
                isimlistesi.add(isim);
            }
        }
        return isimlistesi;
    }
}
