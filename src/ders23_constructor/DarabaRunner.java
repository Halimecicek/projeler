package ders23_constructor;

public class DarabaRunner {
    public static void main(String[] args) {
        // daraba classindan bir obje olusturalim
        DAraba arb1 = new DAraba();
        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yakit);
        System.out.println(arb1.yil);
        System.out.println(arb1.fiyat);

        arb1.marka="tofas";
        arb1.model="kartal";
        arb1.yil=1991;
        arb1.yakit="benzin";
        arb1.fiyat=50000;
        arb1.maxhiz(arb1.yakit);

        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yakit);
        System.out.println(arb1.yil);
        System.out.println(arb1.fiyat);

        DAraba arb2=new DAraba();
        // araba2 nin ozellikleini yazdirmak istersek

        System.out.println("maraka:"+arb2.marka+ "\nmodel:"+arb2.model+
                "\nyakit"+arb2.yakit+
                "\nyil"+arb2.yil+
                "\nfiyat"+arb2.fiyat);

    }
}
