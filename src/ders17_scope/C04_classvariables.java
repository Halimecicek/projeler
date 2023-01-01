package ders17_scope;

public class C04_classvariables {
    public static void main(String[] args) {
        // c03 de ki hastane ismini yazdirmak istiyorum
        System.out.println(C03_objectvariables.hastaneismi); // yildiz hastanesi
        System.out.println(C03_objectvariables.hastasayisi);

        C03_objectvariables.hastasayisi++;
        C03_objectvariables.hastasayisi++;
        medhod1();
        System.out.println(C03_objectvariables.hastasayisi);

    }
    public static void medhod1(){
        C03_objectvariables.hastasayisi++;

    }
}
 // kod takibi main metottan baslar mAIN METOD un sonuna gelinice hersey biter tum degisimler resetlenir
// variable degerleri bastaki hallerine doner