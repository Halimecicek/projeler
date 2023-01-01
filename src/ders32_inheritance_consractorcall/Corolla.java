package ders32_inheritance_consractorcall;

public class Corolla extends BToyota{

    Corolla(int pc){
        super(5);
        System.out.println("parametreli corolla consructor ");


    }
    Corolla(){


    }
    Corolla(String str){
        this();
        System.out.println("String parametreli corolla");

    }
    public static void main(String[] args) {
       Corolla corolla1=new Corolla ();
       Corolla corolla2= new Corolla(3);
       Corolla corolla3=new Corolla("ilker");

    }
}
