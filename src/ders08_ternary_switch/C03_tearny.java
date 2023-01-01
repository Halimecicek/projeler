package ders08_ternary_switch;

public class C03_tearny {
    public static void main(String[] args) {

        int a=5;
        /* ternary operatoru tek basina kullanilmaz tenary bize bir sonuc uretir
         bu sonucu ya direck yazdirmali veya bir variable atamaliyiz
         */
       String sonuc= a%2==0  ? "cift sayi" : "tek sayi";

       /* ternary nin sonucunu bir variable ye atatsak  true veya false durumlarinda
       uretilecek sonucun ayni data turunde olmasi gerekir aksi halde cte olur
       ama ternary sout icinde kullanirsak sonuclarin data turunun ayni olmasi sart olmaz
        */
       String sonuc2= a>10 ? "buyuk sayi" : ""+2*a; // cte vermemesi icin string e cevirdik

        System.out.println(a>10 ? "buyuk sayi" : 2*a);

    }
}
