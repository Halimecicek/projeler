package practic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Soru52 {
    public static void main(String[] args) {
        // int array list oluşturun 10 elemandan oluşmalı
        // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
        // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
        // eğer çift sayı atarsa o elemanının yerine 111 yazsın
        // eğer çift sayı yoksa çift sayı yoktur mesajınıversin.


        List<Integer> sayilar= new ArrayList<>();

        random(sayilar);
    }
    public static void random (List<Integer> sayilar){
        List<Integer> sayilar1= new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            int randomsayi=new Random().nextInt(20);
            if(randomsayi%2==0){
                System.out.println(randomsayi+" ");
                sayilar1.add(111);
            }else{
                System.out.println("cift sayi degil");
                sayilar1.add(randomsayi);
            }
        }
        System.out.println(sayilar1);
    }
}
