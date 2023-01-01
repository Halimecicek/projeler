package practic;

public class Soru24 {
    public static void main(String[] args) {
        /*
         * String parametreli bir metod yazin ve  girililen String icindeki digitlerin
         * toplamini dondursun.
         *
         * Ornek
         * input : ade1r4d3
         * output : 8
         *
         * Ipucu:
         *     Character.isDigit()
         *     Integer.valueOf()
*/
        String str ="ade1r4d3";

   digitToplam(str);


    }
    public static void digitToplam(String str){
        int toplam =0;
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))){
                toplam+= Integer.valueOf(""+str.charAt(i));
            }

        }
        System.out.println(toplam);
    }

}
