package ders36_checked_Exception;

import ders25_statickeyword.Deneme;

import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_IOException {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("src/ders36_checked_Exception/ Deneme.txt");
        FileImageOutputStream fos= new FileImageOutputStream(new File("src/ders36_checked_Exception/ Deneme.txt"));

        // java ile bilgisayarimizdaki bir dosyaya ulasmak istersek
        // FileInputStream class sindaki obje olusturma
        // o obje araciligiyla dosyayi kullanabiliriz

        // fis olustururken ulasmak istedigimiz dosyanin
        // dosya yolunu paramatre olarak girmeliyiz

        /*
        checked exception olusturma ihtimali olan kodlari yazdiginda java comple time orada bir hata ihtimali oldugunu
        gorur ve kodun altiin kirmizi olarak cizer
        bu durumda kirmizi cizgiyi kodlandirmak icin 2 yontem vardir
        1- exception try catch blogu ile handle etmek
        2- javaya sorun ihtimalinin farkinda oldugumuzu ama kodumuza guvendigimize  veya calismaya
        devam etmesini istedigimizi
        soylemek bunu icin signuture na
         */
    }
}
