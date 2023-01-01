package ders13_nesdedforlop_methodolusturma;

public class C02_stringtersinecevirme {
    public static void main(String[] args) {

        String input="java her gecen gun guzellesiyor";
        String tersinput="";

        for (int i =input.length()-1 ; i >=0; i--) {

            tersinput+= input.substring(i,i+1);

        }

        System.out.println("ters hali:"+tersinput);
    }
}
