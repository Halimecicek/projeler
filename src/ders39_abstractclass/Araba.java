package ders39_abstractclass;

public  abstract class Araba {
    // araba clasini inherid eden tum classlar motor , kasa, tekerlek methodlari ovirride etmek zorunda kalsin
    // ancak abs klima methodlari opsiyonel olsun isteyen child methodlari isteyen ovirride etsin isteyen etmesin


    public abstract void motor();

    public abstract void marka();

    public abstract void kasa();


    public abstract void tekerlek();

    public void abs(){
        System.out.println("guvenlik arrtirmak isteyen arabalar abs kullanmali ");
    }
    public void klima(){
        System.out.println("konfor arttirmak icin arabalar klima kullanmali");
    }

    }

