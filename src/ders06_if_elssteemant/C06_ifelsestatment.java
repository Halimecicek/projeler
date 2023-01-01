package ders06_if_elssteemant;

public class C06_ifelsestatment {
    public static void main(String[] args) {

        // if else statment de {} kullanmazsak hem if body si hem de else bod si icin sadece 1 satir kabul eder
        // sonraki satirlar if-else ile iliskilendirilmez her durumda calisir

        int not= 46;


        if(not>=50) {
            System.out.println("sinifi gectin");
            System.out.println("yazin kafan rahat");
        }else{
            System.out.println("bu dersten kaldin");
            System.out.println("yaz okuluna kaldin");
        }
    }
}
