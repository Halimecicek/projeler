package ders31_inheritance;

public class Dotomobil  extends BinekArac{
    public static void main(String[] args) {
        Dotomobil oto1=new Dotomobil();
        System.out.println(oto1.marka);

           // inheritance sayesinde bir child class olusturdugumuzda
          // yeni hicbir variable veya method olusturmadan
         // parent clas(lar)'daki tum ozellikleri almis oluruz
        // Child class'da parent'dan gelen ozellikleri
        // update edebilir veya yeni ozellikler ekleyebiliriz

    }
}
