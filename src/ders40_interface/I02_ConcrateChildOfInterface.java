package ders40_interface;

public class I02_ConcrateChildOfInterface implements I01_Interface {
    // BIR CLASS i bir interface in child i yapmak icin implements keyword
    public static void main(String[] args) {
        System.out.println(mesaj);
        // sayi=40 yazili olmasada interface icerisinde oldugundan  finaldir ve atama yapilamaz
        System.out.println(Integer. MAX_VALUE);


        System.out.println(Math.PI);

    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
