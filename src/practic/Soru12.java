package practic;

public class Soru12 {
    public static void main(String[] args) {
        /*
        Adı 'Seasons' olan bir Enum oluşturun ve Enum da switch-on deyimini kullanarak
              aşağıdakileri yazdırınız.
                Kış için 'Snowboard yapmak'
                 Yaz ve bahar için 'Balık tutmak'
                     Sonbahar için 'Doğa yürüyüşü yapmak'
         */
        String mevsim="sonbahar";
        switch (mevsim){
            case "kis":
                System.out.println("Snowboard yapmak");
                break;
            case "yaz":
            case"bahar":
                System.out.println("Balık tutmak");
                break;
            case "sonbahar":
                System.out.println("Doğa yürüyüşü yapmak");
                break;
            default:
                System.out.println("gecerli mevsim giriniz");
        }
    }
}
