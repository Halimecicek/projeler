package ders29_stringbuilder_acsessmodifier;

public class C03_stringbuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("java ne kadar guzel");
        System.out.println(sb.substring(4));
      //  sb=sb.substring(0,4); esitligin solu stringbuilder sagi ise string
        // java  non- primite datalarda casting yapmaz
        // ayni not integer , byte ve short gibi sayi barindiran non - primitive ler icin de gecerlidir
        // sb guzel kelimeler iceriyor mu ?
        /*
        StringBuilder de olmayan , String klasinda bulunan metotlri kullanmak isterseniz once
         toString ile String e cevirip sonra string manipualation yapilir

         */
        System.out.println(sb.toString().contains("guzel"));

    }
}
