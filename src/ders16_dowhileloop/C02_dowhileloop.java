package ders16_dowhileloop;

public class C02_dowhileloop {
    public static void main(String[] args) {
        // 10,11,12 sayilarini toplayan bir whileloop olusturalim

        int sayi=10;
        int toplam=0;
        do {
            toplam=toplam+sayi;

            sayi++;

        }while (sayi<=12);
    }
}
     // do while loop un 2 avantaji vardir
    // loop badisi en az bir kere calisir ( while loop da basalngic degeri uygun degilse loop bady si hic calismayabilir
    // while bitis kontrolu looop kadar calisir (while loop da bir kere fazla calisirdi