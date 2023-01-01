package practic;

public class Soru18 {
    public static void main(String[] args) {
         /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
*
*/
        String str1="cesaret";
        String str2="insana";
        String str3="sinirlarini";
        String str4=" ogretir";
        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1).toLowerCase()+" "+str2+" " +str3 +str4);
    }
}
