package ders31_inheritance;

public class CSuv extends BinekArac{
    public static void main(String[] args) {
        CSuv suv1=new CSuv();
        System.out.println(suv1.marka);
        System.out.println(suv1.model);
        System.out.println(suv1.motor);
        System.out.println(suv1.plaka);
        System.out.println(suv1.yakit);
        System.out.println(suv1.yil);
        suv1.hiz("benzin");
        suv1.teker();

        CSuv suv2=new CSuv();
        suv2.marka="toyota";
        suv2.model="hrv";
        suv2.motor="1.6";
        suv2.plaka="06 ank 006";
        suv2.yakit="benzin";
        suv2.yil=2012;
        suv2.hiz(suv2.yakit);

    }
    public void hiz(String yakit){
        if(yakit.equalsIgnoreCase("benzin")){
            System.out.println("benzinli suv ler max hiz 300km");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("dizel suv lar max hiz 260km");
        } else if (yakit.equalsIgnoreCase("hibrit")) {
            System.out.println("hibrit suv lar max hiz 220km");
        }else{
            System.out.println("yakit belli degil max hiz soyleyemem");
        }

    }
}
