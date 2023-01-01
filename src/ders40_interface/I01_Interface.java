package ders40_interface;

public interface I01_Interface {
    // interfaceler ozel yapi olduklarindan
    // yazilsada yazilmasa da tum variableler  public
    // static ve final dir
    String mesaj="Hello interface";
    static int sayi=20;
    public static boolean guzelmi= true;
    public static final int sayi2=30;

    void method1();
    abstract int method2();
    public abstract String method3();





}
