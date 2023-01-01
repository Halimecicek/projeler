package ders31_inheritance;

public class GCorolla extends Ftoyota {
    String model="COROLLA";
    String uretimyeri=" Turkiye";

    GCorolla(){
        super();
        System.out.println("corolla cons calisti");
    }

    public static void main(String[] args) {
        GCorolla corolla1= new GCorolla();
        System.out.println(corolla1.marka);


    }

}
