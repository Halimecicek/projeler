package ders40_interface;

public class I07_ConcareteChildOfInterface implements I05_Interface,I06_Interface {


    public static void main(String[] args) {
        System.out.println(I06_Interface.MESAJ);
        System.out.println(I05_Interface.SAYI);
        System.out.println(SAYI2);
    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public int method4() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
