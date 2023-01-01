package ders08_ternary_switch;

public class C02_tearny {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="ali";

        // verilen iki metin birbiri ile ayni ise "metinler ayni"
        // farli ise "metinler farkli " yazdirin

        if (str1.equals(str2)){  // equals metinler de  ayni mi mantiginda calisan bir mettot dur
            //  stiring de ( == ) manasinda kulllanilir cunku == sayisal veri ve char da equals da string gibi metin yazimlarinda
            System.out.println("metinler ayni ");
        }else{
            System.out.println("metinler farkli");
        }
        System.out.println(str1.equals(str2) ? "metinler ayni " : "metinler farkli");
    }
}
