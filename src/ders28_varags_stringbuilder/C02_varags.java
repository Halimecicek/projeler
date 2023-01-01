package ders28_varags_stringbuilder;

public class C02_varags {
    public static void main(String[] args) {
        topla(5, 6);
        topla(5, 3, 8);
        topla(2, 4, 6, 8);

        // bir method da parapmetre sayisini sinirlandirmak istemezseniz standart bir variable yerine varags kullaniriz
        // varags data turunun yaninia ... nokta koyulatak deklare edilir
        // int...==> sayisi belirli olmayan int parametrekler alan bir arraydir
    }

    private static void topla(int... sayilar) {
        int toplamsonuc=0;
        for (int each :sayilar
             ) {
            toplamsonuc+=each;


        }
        System.out.println("girilen sayilarin toplami: "+toplamsonuc);

    }
}