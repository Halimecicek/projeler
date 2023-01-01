package ders10_stringmanipulation;

public class C07_soru {
    public static void main(String[] args) {
        /* kulllanicidan bir cumle ve bir metin alin cumlede metnin durumuna gore
        1 cumle metni icermiyor
        2cumle metni 1 kere iceriyor
        3- cumle metni birden fazla iceriyor
  seceneklerinden uygun olani yazdirin
         */
        String cumle="java cok guzeldir cok.";
        String metin="cok";
        if (!cumle.contains(metin)){
            System.out.println("cumle metni icermiyor");
        }else{
            int ilkindex=cumle.indexOf(metin);
            int ikinciIndex=cumle.indexOf(metin,ilkindex+1);

            if (ikinciIndex==(-1)){
                System.out.println("cumle metni sadece 1 kere iceriyor");
            }else {
                System.out.println("cumle metni birden fazla iceriyor");
            }
        }


    }
}
