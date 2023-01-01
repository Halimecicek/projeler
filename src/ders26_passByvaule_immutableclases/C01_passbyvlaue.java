package ders26_passByvaule_immutableclases;

public class C01_passbyvlaue {
    public static void main(String[] args) {
        double fiyat=100;
        System.out.println(indirimuygula(fiyat));
        System.out.println(indirimuygula(fiyat));
        System.out.println(indirimuygula(fiyat));

        System.out.println(fiyat);

        fiyat=indirimuygula(fiyat);
        System.out.println("indirim uygulanmis"+fiyat);
    }
    /*
    Kodlarimizin anlasi;ir olmasi icin main method'dan diger method'lara
    parametre olarak gonderdigimiz variable'lar icin ayni isimli variable
    olusturmayi TERCIH EDERIZ
    Java method'lar arasinda gecis yaparken variable'i degil
    variable'in value'sunu pass eder
    Bu Java'nin Pass By Value'yu tercih etmesinden kaynaklaniyor
    Eger method'un icerisinde yaptiginiz degisikligin
    main method icin de gecerli olmasini isterseniz
    main method icerisinde
    fiyat= indirimUygula(fiyat);
    atamasini yapabiliriz.

     */
    public static double indirimuygula(double fiyat){

        fiyat=fiyat*0.9;


        return fiyat;


    }
}
