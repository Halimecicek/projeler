package ders30_encapsullation;

public class C01_Encapsulation {
    public static void main(String[] args) {
        AEncapsulation pers1=new AEncapsulation();




        pers1.hemsireadresi="ankara";
        pers1.hemsireismi="yildiz yildiz";
        System.out.println(pers1.gethastaneismi());

        pers1.setHastaucreti(500);

        // getter ve setter method'lari
        // bazen de erisimi sinirlandirmak icin degil
        // kullanicilarin islevi iyi anlamasi icin kullanilir

        System.out.println(pers1.getHemsireadresi());
        pers1.setHemsireadresi("Istanbul");
        System.out.println(pers1.getHemsireismi());
    }
}
