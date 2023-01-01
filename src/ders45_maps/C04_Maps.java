package ders45_maps;

import ders44_maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C04_Maps {
    public static void main(String[] args) {
        // ogrenci map in de numarasi verilen sayilarin arasinda sinirlar dahil olan ogrencilerin
        // isim soy isim ve bolumleri list olarak donduren method olusturun

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        int baslangicno=103;
        int bitisno=107;

        List<String>isimListesi=MapDepo.numaraDegerineGoreListeolustur(ogrenciMap, baslangicno, bitisno);

        System.out.println(isimListesi);

    }
}
