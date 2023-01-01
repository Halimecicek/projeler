package ders23_constructor;

public class DAraba {
    // bir proje olustururken tum claslarda main mehod olmasina gerek yok
    // cogu class obje olusturularak kullanilmak uzere hazirlanmis depolardir
    //  biz de bu clas daki araba objelerini icin bir depo olarak dizay edelim
    String marka = "marka belirtilmeedi";
    String model = "model belirtilmedi";
    String yakit;
    int yil ;
    int fiyat;

    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat ;
    }



     public int maxhiz (String yakit){
         int maxhiz=120;

         if (yakit.equalsIgnoreCase("dizel")){
             maxhiz=200;

         } else if (yakit.equalsIgnoreCase("benzin")) {
             maxhiz=230;
         } else if (yakit.equalsIgnoreCase("elektrikli")) {
             maxhiz=180;

         }
         return maxhiz;
     }
}
