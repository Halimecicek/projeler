package practic;

public class Soru13 {
    public static void main(String[] args) {
        /*
        a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "Bahar"
        c) Haziran, Temmuz, Ağustos için "Yaz"
        d) Eylül, Ekim, Kasım için "Güz"
        e) Diğerleri için "Geçersiz ay adı"
         */

        String ay = "kasim";
        switch (ay){

            case "aralik":
            case "ocak":
            case "subat":
                System.out.println("kis");
                break;
            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("bahar");
                break;
            case"haziran":
            case "temmuz":
            case "agustos" :
                System.out.println("yaz");
                break;
            case"eylul":
            case"ekim":
            case "kasim" :
                System.out.println("guz");
                break;
            default:
                System.out.println("gecersiz ay ");

        }
    }
}
