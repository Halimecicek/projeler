package ders07_nestedifelsestatment;

public class C05_nestedifelsesteatments {
    public static void main(String[] args) {
        // kullanicidan aldigi urun adedi ve liste fiyati alin
        //kullaniciya musteri karti olup olmadigini sorun
        // musteri karti varsa 10 urunden fazla alirsa %20 yoksa %15
        // musteri karti yoksa 10 urunden fazla alirsa


        int urunadedi = 30;
        boolean kartvarmi = true;
        double listefiyati = 12.5;
        double toplamfiyat = 0;

        // ana degisken kart

        if (kartvarmi) {
            // kart var
            if (urunadedi < 0) {
                System.out.println("hatali urun adedi girisi");
            } else if (urunadedi < 10) {
                toplamfiyat = urunadedi * listefiyati * 0.85;
                System.out.println("% 15 indirimli toplam fiyat :" + toplamfiyat + "tl");
            }else {
        }
            toplamfiyat = urunadedi * listefiyati * 0.80;
            System.out.println("% 20 indirimli toplam fiyat :" + toplamfiyat + "tl");
        }



            //kart yok


        }
    }

