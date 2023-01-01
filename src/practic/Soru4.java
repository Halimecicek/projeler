package practic;

public class Soru4 {
    public static void main(String[] args) {
        //Mağazada da 5 adet ürün mevcut.
        // Eğer seçeceğiniz iki ürünün fiyatı 100 TL'den
        // fazla ise ekranda bu ürünlere paranız yetmemektedir yazdıran kodbloğunuyazın


         int kazak=50;
         int etek=40;
         int gomlek=35;
         int pantolon=60;
         int penye=70;

         if(kazak+etek>100){
             System.out.println("paraniz yetmemektedir");
         }else {
             System.out.println("urunu alabilirsiniz");
         }
    }
}
