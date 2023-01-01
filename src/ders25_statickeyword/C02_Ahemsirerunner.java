package ders25_statickeyword;

public class C02_Ahemsirerunner  {
    public static void main(String[] args) {
        C01_Ahemsire h1=new C01_Ahemsire();
        h1.personelismi="ayse;";
        h1.personeladresi="ulus";
        h1.personeltelefon="3124546";
        System.out.println(h1);

        C01_Ahemsire h2=new C01_Ahemsire();
        h2.personelismi="hatce";
        h2.personeladresi="sincan";
        h2.personeltelefon="31256789";
        h2.bashekimismi ="yasarkemal";

        System.out.println("h1:"+h1);
        System.out.println("h2:"+h2);
    }
}
