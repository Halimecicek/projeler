package ders39_abstractclass;

public  class CHondaCivic extends BHonda  {
    @Override
    public void motor() {
        System.out.println("hoda civic araclar vtec tek arac.");
    }

    @Override
    public void kasa() {
        System.out.println("civic sedan veya ");

    }

    @Override
    public void tekerlek() {
        System.out.println(" civic iyi teker kullanir");

    }

    @Override
    public void yakit() {
        System.out.println(" civic benzinli  cok yakar");

    }

    @Override
    public void guvenlik() {
        System.out.println("civic");

    }
    @Override
    public void abs(){
        System.out.println("honda civic abs kullanir");
    }
    @Override
    public void klima(){
        System.out.println("honda civik klimalari vardir");
    }

    public static void main(String[] args) {

        /*
        abstract parent classlardaki abstract methodlar concrate child class lar tarafindan mecburen ovirride edilir
        ancsk abstract parentlerin concrate methodlari override etmek mecburi değildir
        Eger Chıld class'a uyarlamak isterseniz override edebilirsiniz
        veya override etmeyip parent classs'daki haliyle kullanabilirsiniz.
         */
        CHondaCivic civic1=new CHondaCivic();
        civic1.abs();
        civic1.klima();
        civic1.marka();
        civic1.ozelTeknoloji();
    }
}
