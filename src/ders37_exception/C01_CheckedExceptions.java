package ders37_exception;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;

public class C01_CheckedExceptions {
    public static void main(String[] args) {
        String dosyaYolu="src/ders36_checked_Exception/Deneme.txt";
         int k =0;



        }
}



/*
        Bir kod calisirken birden fazla exception olusma ihtimali varsa
bu kodu calisir hale getirmek icin 4 ihtimal vardir

1- herbir exception ic ice try-catch bloklari kullanmak
2- Bir tane try blogu birden fazla catch blogu olusturmak
3- method signature'na tum exception ihtimallerini yazmak (exceptions handle edilmis olmaz)
4- eger muhtemel exceptiopn'larin tumunu kapsayan, daha genis kapsamli bir exception varsa
   onu kullanmak
 */

 /* 2. ve 3. ıhtımallerde olusması muhtemel exception'lar arasında parent-chıld
        ilişkisi olup olmadıgı kontrol edilmelidir.
        aralarında parent chıld ilişkisi yoksa exceptionları istediğimiz sırada yazabiliriz

        ANCAK parent chıld ilişkisi varsa önce chıld sonra Parent yazılmalıdır.
        AKSİ TAKDİRDE parent daha kapsamlı oldugundan tum exceptionları yakalar ve
        aşagıdakı chıld exception işlevsiz kalır java bu durumu kabul etmez . CTE verir
         */