package ders03_datacastingWrappe;

public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi= 10;

        char krk='b';
        Character krkWrapper='c';

        System.out.println(Character.isLetter('5'));
        System.out.println(Character.isDigit('7'));

        String str1="123";
        String str2="12";
        //str1 ve str2 nin matematiksel degerini toplayin
        System.out.println(str1+str2);
        System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2)); //135

        //integer.parseInt icine yazilan str rakamlardan olusuyorsa str i int ye cevirir
        // ancak bir karakter bile rakam degilse hata verir

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);


    }
}
