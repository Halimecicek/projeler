package ders11_stringmanipualition;

public class C04_replaceAll {
    public static void main(String[] args) {
        // kullanicinin girdigi metinde
        // harf didsinda kalan tum karakterleri temizleyen bir kod yazin
        // not: space silinmemli
        String input= "Ja5+va cok 1*guzeldir";

       input=input.replaceAll("\\d","");
       input=input.replace(" ","5");
       input=input.replaceAll("\\W","");
       input=input.replace("5"," ");

        System.out.println(input);
    }
}
