package ders30_encapsullation;

public class Echild extends Dparent{
    /*
    javadaki inheritance in insanlardan en buyuk farki :
    insanlarda parentchild edilebilir ama ckild parentini secemez
    java da ise tam tersidir
    - siz bir clsass olusturdugunuzda daha once olusturulmus classlardan
    tum ozelliklerini inherit etmek istediginiz class i parent edinirsiniz

    bir class baska bir clasi inherit etmek istediginde
    extends keyword ile bu deklare eder
     */
    public static void main(String[] args) {

        Echild child1= new Echild();
        child1.yas=30;
        child1.isim="mahmut";
        child1.isenough=false;

    }
}
