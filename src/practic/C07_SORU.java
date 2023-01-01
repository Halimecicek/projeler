package practic;

public class C07_SORU {
    public static void main(String[] args) {
        //Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        //sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        //input : java1 ogRe2@nMek3 #ne +Gu=zel
        //output : Java ogrenmek ne guzel.

        StringBuilder sb1 = new StringBuilder("OCAJP8");

        sb1.subSequence(2, 4);

        sb1.deleteCharAt(3);

        sb1.reverse( );

        System.out.println(sb1);

    }
}
