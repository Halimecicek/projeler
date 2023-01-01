package ders34_overriding_pollmorphism;

public class Bchild  extends Aparent{
    public void method1(){
        System.out.println("child class method1");

    }
    public void  method2(int a ){
        System.out.println("child class method2");
        // overloading olAbilmesi icin
        // hem method ismi hemde method signature ayni olmali
    }
    public void method2(String isim){
        System.out.println("child class String paremetreli method");
    }
    @Override
    public void method3() {
      //  super.method3();
     // overriding varsa parent ve child class daki
        //
    }


}
