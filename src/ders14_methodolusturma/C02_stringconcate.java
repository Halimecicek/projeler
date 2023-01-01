package ders14_methodolusturma;

public class C02_stringconcate {
    // verilen iki string i parametre olarak kabul edip
    // bu iki string aralarinda bir bosluk olan tek bir string olarak
    // main method a donduren bir method olusturun

    public static void main(String[] args) {
        String str1="java";
        String str2="candir";
        System.out.println(birlestirmetodu(str1,str2));
        System.out.println(birlestirmetodu("bu da ", "oldu"));


    }
    public static String birlestirmetodu(String str1, String str2){
        return str1+" "+str2;

    }


}
