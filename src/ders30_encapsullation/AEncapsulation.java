package ders30_encapsullation;

public class AEncapsulation {
    private String hastaneismi="yildiz Hastanesi";

    public void setHastaucreti(int hastaucreti){
        this.hastaucreti=hastaucreti;
    }

    private int hastaucreti;
    // hasta ucreti de giris yapilabilsin ama
    // ucreti sigortadan alinacagi icin
    // personel hasta ucretlerini gormesin
    //setter medhod u lazim

    public String gethastaneismi(){
        return hastaneismi;
    }

    String hemsireismi;
    String hemsireadresi;
    // bu instance variablelara herkes ulasabilsin
    // bu durumda public yapmak akla ilk cozum olacaktir
    // bu variableleri public yapmak yerine
    //private yapip getter ve setter olusturmak
    // da ayni isi gorur(developerler genelde boyle kullanir )

    public String getHemsireismi(){
        return hemsireismi;
    }

    public void setHastaneismi(){
        this.hemsireismi=hemsireismi;
    }
    public String getHemsireadresi(){
        return hemsireadresi;
    }

    public void setHemsireadresi(String istanbul){
        this.hemsireadresi=hemsireadresi;

    }

    private int hastaneucreti;

}
