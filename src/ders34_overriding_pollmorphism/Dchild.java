package ders34_overriding_pollmorphism;

public class Dchild extends Cparent{
    // overriding kurallari
    // acsesmodifier  method signature a dahil olmadigindan
    // ovirriden ve overriding acsess modifier farkli olabilir
    // child parenti sinirlandiramaz
    // yani overriding  method u acsess modifier ayni yada  daha genis kapsamli olma
    // privite -- defould -- protected-- public

    public void method1(){

    }
    //  privite ve static methodlar override edilemez
    // ayni isimde method olusturulunca java CTE vermez
    // ancak override isareti cikmaz ve @Ovirride notasyonu kullanmak istenirse CTEolur
    // yani java bunlari farkli classlardaki
    protected static void method2(){

      // return type method signature ine dahil olmadigindan
        // farkli secebilir ancak return type void veya primitive ise ayni olmak zorundadir
     // eger return type lar non- primite ise child clasdaki return type
        // parent class daki return type i ile ayni veya child olmalidir
    }

    private void method3(){

    }
    public void  method4(){

    }
    public Integer method5() {
     return 5;

    }
}
