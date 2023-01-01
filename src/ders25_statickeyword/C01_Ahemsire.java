package ders25_statickeyword;

public class C01_Ahemsire {
    static String hastaneismi = "yildiz hastanesi";
    static String hastaneadresi = "cankaya / ankara";
    static String bashekimismi = "Dr mehmet yilmaz";

    String personelismi = "belirtilmedi";
    String personeladresi = "belirtilmedi";
    String personeltelefon = "belirtilmedi";

    public String toString() {
        return "AHemsire" +
                "   \npersonelIsim : " + personelismi +
                " \npersonelAdresi : " + personeladresi +
                "\npersonelTelefon : " + personeltelefon +
                "\n   hastane ismi : " + hastaneismi +
                "\nhastane adresi : " + hastaneadresi +
                "\n  bashekim adı : " + bashekimismi;
    }
}