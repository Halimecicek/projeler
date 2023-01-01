package practic;

import java.util.Scanner;

public class C04_soru {
    public static void main(String[] args) {
       // verilen bmi degerleri icin vucut kitle indeksi bmi ile ilglili mesajlari yazdirmak icin kod yaziniz
        // gecersiz ibm degerri<0
        //  zayif =18.5
        // normal agirlik =18,5-24.9
        // fazla kilolu =25-29.9
        // obazite = 30 veya daha buyuk


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen vucut kitle indeksi BMI giriniz ");
        double vke= scan.nextDouble();

        if (vke> 30) {
            System.out.println("obez");

        }else if (vke<29.9 && vke>=24.9){
            System.out.println("kilolu");

        } else if(vke<24.9 && vke>=18.5){
            System.out.println("normal");

        }else if (vke<18.5){
            System.out.println("zayif");

        }else if (vke<0)
            System.out.println("gecersiz imd degeri ");
        }
    }



