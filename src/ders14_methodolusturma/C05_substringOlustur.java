package ders14_methodolusturma;

public class C05_substringOlustur {

    /*
    Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore baslangic
    index’i dahil, bitis index’i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
 - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
 - kullanici str’da olan index’lerden daha buyuk bir index girerse hata mesaji yazdirin.
     */


    public static void main(String[] args) {
        String input= "java ne kadar  guzel";
        int baslangicindexi=5;
        int bitisindexsi=7;
        kendisubstringmetodumuz(input,baslangicindexi,bitisindexsi);
        kendisubstringmetodumuz("java ",1,3);
        kendisubstringmetodumuz("deneme,",6,3);
    }

    public static void kendisubstringmetodumuz(String input, int balangicindexi, int bitisindexsi){

        if (balangicindexi>bitisindexsi){
            System.out.println(" baslangic indexi bitis indexinden buyuk olamaz");
        } else if (bitisindexsi>=input.length()) {
            System.out.println("bitis indexi strinin sinirlari disinda");

        }else{



            for (int i =balangicindexi; i < bitisindexsi ; i++) {
                System.out.print(input.charAt(i));

            }


            System.out.println("");
        }



    }
}
