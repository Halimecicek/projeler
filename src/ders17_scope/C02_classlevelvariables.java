package ders17_scope;

public class C02_classlevelvariables {
    // class level variable method larin disinda olusturulur
    // genel kullanim en uste olusturulmalaridir
    static String hastaneismi="yildiz hastanesi";

    static int hastasayisi=2345;
    static String bashekim;
    String personelismi;
    int personelyasi;


    public static void main(String[] args) {
        System.out.println(hastaneismi); // yildiz hastanesi
        System.out.println(bashekim); // null
       // System.out.println(personelismi); // static olmadigindan kullanilamaz
        /*
        class level variableler deger atamasi yapilmamis olursa bu variablelere data turune gore
        defolt olarak tanimlanan degerleri atar default degerler
        sayisal variabler :0
        boleon:false
        char: ''
        objeler (string dahil ) : null
         */

    }

    public static void method1(){
        System.out.println(hastasayisi);
        hastasayisi++;


    }

    public void method2(){
        System.out.println(hastasayisi);
        System.out.println(personelismi);

    }
}
