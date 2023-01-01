package ders07_nestedifelsestatment;

public class C02_ifelseifsteatment {
    public static void main(String[] args) {
        // kullanicidan aldigi urun adedi ve liste fiyati alin
        //kullaniciya musteri karti olup olmadigini sorun
        // musteri karti varsa 10 urunden fazla alirsa %20 yoksa %15
        // musteri karti yoksa 10 urunden fazla alirsa

        int urunadedi=30;
        boolean kartvarmi=true;
        double listefiyati=12.5;
        double toplamfiyat=0;



        if (kartvarmi==true && urunadedi>10){       // kartvarmi sadece yazsak olur ==true yazmaya gerek yok
            toplamfiyat =urunadedi*listefiyati* (0.8);
            System.out.println("% 20 indirimli toplam fiyat:" +toplamfiyat);

        }else if ( kartvarmi==true && urunadedi<10 && urunadedi>0) {
            toplamfiyat = urunadedi * listefiyati * (0.85);
            System.out.println("% 15 indirimli toplam fiyat"+toplamfiyat);
        }else if (!kartvarmi==false && urunadedi>10){
            toplamfiyat = urunadedi * listefiyati * (0.85);
        System.out.println("% 15 indirimli toplam fiyat"+toplamfiyat);
        } else if (!kartvarmi==false & urunadedi<10 && urunadedi>0) {
            toplamfiyat = urunadedi * listefiyati * (0.9);

            System.out.println("% 10 indirimli toplam fiyat" + toplamfiyat);
        }else {
            System.out.println("gecersiz kod");
        }
        }
}
