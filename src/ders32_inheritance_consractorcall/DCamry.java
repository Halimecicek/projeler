package ders32_inheritance_consractorcall;

public class DCamry extends BToyota {

    DCamry(String pc){
        super("deniz");
        System.out.println("string parametreli Camry");
    }

    DCamry(){

    }




    public static void main(String[] args) {

        // eger kullanilAn argumente uygun bir constructor
        // parent classda yoksa CTE verir
        DCamry camry2=new DCamry("celal");
        System.out.println("===============");
        DCamry camry1=new DCamry();

    }
}
