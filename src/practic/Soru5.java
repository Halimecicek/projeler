package practic;

public class Soru5 {
    public static void main(String[] args) {
        // son basamak 5 e esit veya 5 den buyukse yuvarlama islemi "son basamagi bir ust ondaliga yuvarla
        // son basamak 5 den kucukse yuvarlama islemi " son basamagi bir alt ondaliga yuvarla

        int sayi=61;

        if (sayi%10>=5){
            System.out.println(10-(sayi%10)+sayi);
        } else if (sayi%10<5) {
            System.out.println(sayi-(sayi%10));

}
    }
}
