package ders10_stringmanipulation;

public class C09_soru {
    public static void main(String[] args) {
        String cumle= "Java cok guzeldir cok.";
        String metin= "cok";
        int ilkIndex= cumle.indexOf(metin);
        int sonIndex= cumle.lastIndexOf(metin);
        if (ilkIndex==(-1)){
            System.out.println("cumle metni icermiyor");
        } else if(ilkIndex==sonIndex){
            System.out.println("cumle metni sadece 1 kere iceriyor");
        }else {
            System.out.println("cumle metni birden fazla iceriyor");
        }
    }





     /* kulllanicidan bir cumle ve bir metin alin cumlede metnin durumuna gore
        1 cumle metni icermiyor
        2cumle metni 1 kere iceriyor
        3- cumle metni birden fazla iceriyor
  seceneklerinden uygun olani yazdirin
      */



}
