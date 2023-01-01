package ders35_exceptions;

public class C02_aritmetik_exceptions {
    public static void main(String[] args) {
      //  verilen  iki sayiyi birbirine bolup
        // sonucunu tam sayi yazdirin

        int sayi1=20;
        int sayi2=0;
        try {
            System.out.println(sayi1/sayi2);
            System.out.println("bakalim bu satir calisacak mi");

        }catch (ArithmeticException e ){

            System.out.println("sayi sifir a bolunemez");
        }

        // catch (ArithmeticException e)  ongordugumuz risk

        // catch(0 'den sonraki { } catch blogu denir
        // beklenen risk gerceklesirse calisacak kodlar
    }
        /*
          Bazi exception'lar if else ile handle edilebilir ancak
          tum exception'lar icin if else yeterli olmaz
         */

}

