package ders33_inheritanceDataTypeKullanimi_overloding;

public class Favcikuslar extends Ekuslar {

    public void hareket(){
        System.out.println("Avci kuslar ucarlar");
    }
    public void beslenme(){
        System.out.println("Avci kuslar et yerler");
    }
    public void pence(){
        System.out.println("Avci kuslar penceledir");
    }
    public void gaga(){
        System.out.println("Avci kuslar gagaldır");
    }

    public static void main(String[] args) {


        Favcikuslar avci1= new Favcikuslar();
        avci1.beslenme();
        avci1.gaga();
        avci1.pence();
        avci1.hareket();
        avci1.cogalma();
        avci1.kanat();
        avci1.omur();
        avci1.solunum();

        /* bir obje olusturulurken constructor ve data türü aynı ise
        Hangi METHOD'un geçerli oldupunu bulmak için o class'a gider
        varsa kullanırız . yoksa sırası ile parent'lara gider
        ilk bulduğumuzu kullanırız.
         */

        Ekuslar avci2= new Favcikuslar();

        avci2.beslenme();
        avci2.gaga();
        //avci2.pence();
        avci2.hareket();
        avci2.cogalma();
        avci2.kanat();
        avci2.omur();
        avci2.solunum();
          /*
        Bir obje oluşturulurken data türü ile constructor farklı ise hangi method'un
        geçerli olacağını bulmak için önce data türünün olduğu class
        ve parent'larına bakarak o method'u buluruz
        bulamaz isek CTE verir ,
        bulurisek HEMEN ÇALIŞTIRMAYIZ
        çalıştırmadan önce o method override edilmiş mi diye control ederiz
        override edilmiş ise override eden method'u calıştırırız.
         */

      Dhayvanlar avci3 =new Favcikuslar();
        avci3.beslenme();
        //avci3.gaga();
        //avci3.pence();
        avci3.hareket();
        avci3.cogalma();
        //avci3.kanat();
        avci3.omur();
        avci3.solunum();

        Ekuslar kus1 = new Ekuslar();
        kus1.cogalma();
        kus1.gaga();
        kus1.kanat();
        kus1.hareket();
        kus1.solunum();
        kus1.beslenme();
        kus1.omur();

        /*
        METHOD'larla belirlenen özellikler
        en güncel bilgiyi bulurken veriable' ile belirlenen
        özellikler ilk buldugu degeri kullanır.
        bunun için METHOD'lara DİNAMİK ,
        VERIABLE'lalara STATİK  Özelliklidir
         */

        Dhayvanlar kus2= new Ekuslar();
        kus2.cogalma();
       // kus2.gaga();
       // kus2.kanat();
        kus2.hareket();
        kus2.solunum();
        kus2.beslenme();
        kus2.omur();


    }


    }
