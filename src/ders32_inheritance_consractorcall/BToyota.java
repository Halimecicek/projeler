package ders32_inheritance_consractorcall;

public class BToyota extends Araba {
    BToyota(){
        System.out.println("parametresiz toyota constructor");

    }
    BToyota(int pt){

        System.out.println("parametreli toyota constructor");
    }
    BToyota (String pt2){
        super("mehmet");
        System.out.println("string parametreli consructor ");
    }
}
