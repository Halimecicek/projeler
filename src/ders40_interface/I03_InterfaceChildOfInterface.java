package ders40_interface;

public interface I03_InterfaceChildOfInterface extends I01_Interface{

    //EGER BIR INTERFACE YI baska bir interface ye child yapmak isterseniz
    // extens keyword kullanilir
    // bir interface conrate class i inherit edemez

    void method1();
    // interface bir child parent interface
    // abstract methodu ovirride edebilir ama
    // ikisinin de body si olmadigindan
    // bu islemin bir anlami yoktur

    int method4();
    boolean method5();

}
