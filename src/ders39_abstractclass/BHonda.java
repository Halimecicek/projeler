package ders39_abstractclass;

public abstract class BHonda extends Araba{
    // abstract bir class parent edindigimizde iki alternatifinmiz olur
    // 1 -parentimiz olan abstrackt classdaki acstract methodlari ovirride etmek
    // 2 - proje yapimiz gerektiriyorsa u classida abstract yapmak


    public void marka(){
        System.out.println("marka: HONDA");
    }
    public abstract void yakit();

    public abstract void guvenlik();

    public void ozelTeknoloji(){
        System.out.println("tum honda arabalar vtec teknolojisi kullanilmali");
    }
}
