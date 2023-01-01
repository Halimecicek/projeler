package ders41_Iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        // java collections icerisindeki bazi classlar index desdeklemez 
        // bu durumda index kullANMADAN collections icerisindeki tum elementlere ulasabilmek 
        // ve onlari update edebilmek icin farkli ihtiyacimizz olur
        
        // list<> index yapisini destekledigini icin boyle bir ihtiyac duymaz 
        // ancak bugunluk 


        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        // index kullanmadan list in tum elemenlerini yazdirin
        for (Integer each:sayilar
             ) {
            System.out.print(each+ " ");
        }
        // İNDEX kullanmadan List'in elementlerini birer arttırın.
        // İNDEX kullanmadan 25'den büyük sayıları List'den silin

        for (Integer each:sayilar
             ) {
            System.out.print(each + 1 + " ");

        }
        System.out.println("");
        System.out.println("sayilar = " + sayilar);

        for (Integer each:sayilar
              ) {
            each+=1;
                System.out.println(each+" ");
            }

        System.out.println("");
        System.out.println("sayilar = " + sayilar);

       /* Index kullanmadan LİST'in elemanlarını kalıcı olarak değiştirmek mümkün olmadı :/
        Java bunun için Iterator İnterface'i oluşturmuştur.
         */





        }


    }

