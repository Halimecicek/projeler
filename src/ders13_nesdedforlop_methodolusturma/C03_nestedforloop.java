package ders13_nesdedforlop_methodolusturma;

public class C03_nestedforloop {
    public static void main(String[] args) {
        // 1-4 arasindaki sayilar icin carpim tablosu olusturalim
        // dis dongu satirlari kontrol eder

        for (int i = 1; i <=4 ; i++) {

            // ic dongude her satirda olan degerleri kontrol eder

            for (int j = 1; j <=4 ; j++) {
                System.out.print(i*j +" ");
            }
             // ic dongu bittiginde javat\yi asagi indir
            System.out.println("");
        }
    }
}
