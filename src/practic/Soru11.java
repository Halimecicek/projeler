package practic;

public class Soru11 {
    public static void main(String[] args) {
        /*
        Cinsiyet "Erkek" ise "Erkek" yazdırınız.
        Cinsiyet "Kadın" ise "Kız" yazdırınız.
        Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
Not : Bu seçenekler dışındakileriniyoksayınız.
         */

        String cinsiyet="kadin";

        switch (cinsiyet){
            case "kadin":
                System.out.println("kadin");
                break;
            case "erkek":
                System.out.println("erkek");
                break;
            default:
                System.out.println("digerleri");
        }
    }
}
