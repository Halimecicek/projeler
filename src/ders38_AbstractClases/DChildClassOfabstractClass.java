package ders38_AbstractClases;

public class DChildClassOfabstractClass extends CParentAbstractClass {

    // abstract bir class daki abstract methodlarin tamami concrate
    // chil class lar tarafindan ovirride edilmelidir

    @Override
    public void mecburiMethod1(){
        System.out.println("child class method icerisinde method u kendine uyarlar");
    }
    @Override

    public void mecburiMethod2(){

    }


}
