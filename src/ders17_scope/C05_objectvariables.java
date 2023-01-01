package ders17_scope;

public class C05_objectvariables {
    public static void main(String[] args) {

        C03_objectvariables pers1=new C03_objectvariables();

        System.out.println(pers1.personelismi);
        System.out.println(pers1.personelyasi);

        pers1.personelismi="suluman";
        pers1.personelyasi=35;

        C03_objectvariables pers2=new C03_objectvariables();
        pers2.personelismi="latife";
        pers2.personelyasi=32;

        System.out.println(pers1.personelismi);
        System.out.println(pers2.personelismi);

        C03_objectvariables pers3=new C03_objectvariables();
        pers3.personelismi="heysen";
        pers3.personelyasi=30;

    }
}


// c03 clasindaki instance variable lara nasil ulasabiliriz
// instance variablelerin diger adi obje variable laridir
// instance variable lara obje uzerinden ulasabiliriz
