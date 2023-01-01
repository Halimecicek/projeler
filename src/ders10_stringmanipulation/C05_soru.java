package ders10_stringmanipulation;

public class C05_soru {
    public static void main(String[] args) {
        /*
        mail kontrolu yapan bir program hazirlayin
       1 mail @ isareti icermiyorsa gecersiz mail
       2 @gmail.com icermiyorsa gmail adresi yazin
       3 @ gmail.com ile bitmiyorsa yazim hatasi
         */

        String email = "ahmet@bulutluoz.com";
        if (!email.contains("@")) { // icermiyorsa dedigi icin ! isareti basina konur
            System.out.println("gecersiz email");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("yazim hatasi");
        }else {
            System.out.println("email basari ile kaydedildi");
        }


        }
    }
