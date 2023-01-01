package ders40_interface;

public interface I08_InterfaceStaticDefouldMethod {

    /*
    JAVA 8 ile developerlerin talebi uzerine yeni bir istisnai durum java ya eklenmistir
    bir interface yi yillar icerisinde yuzlerce class inherid vermis olabilir

      sonradan Interface'e eklenen bir abstract method tüm eski child'lar tarafından inherit
    edilmelidir. Aksi takdirde tüm eski child class'lar CTE verecektir

    Java 8 ile birlikte Java , Interface'lere default veya static ile işaretlenmek şartı ile
    body'si olan method eklenmesine izin vermiştir.
    bu sayede interface ye sonradan eklenen method body si oldugu icin ovirride edilmek zorunda degildir


    interface icerisinde bodysi olan method olusturmak icin kullanilan defoult
     */

    void method1();
    void method2();
    public default void method3(){
        System.out.println("interface icindeki body li default method");
    }
    // interface de ki tum methodlar public ve abstract dir
    // biz interface deki bir method deklarasyonuna defoult yazarsak bu acsess modifier degildir.

    public static void method4(){
        System.out.println("interface icindeki body li static method");

    }

}
