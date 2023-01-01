package ders04_matematikselislemler;

public class C05_incrementdecrement {
    public static void main(String[] args) {

        int sayi=10;
        // bu sayiyi 3 artiralim ve yazdiralim

        sayi= sayi+3;

        System.out.println(sayi);

        sayi+=3;
        System.out.println(sayi);

        int s=10;
        //bu sayiyi 1 artirin
        s=s+1;

        System.out.println(s);
        s+=1;
        System.out.println(s);
        s++;
        System.out.println(s);

        int t=10;
        // bu sayinin degerini 1 eksiltin
        t=t-1;
        t-=1;
        t--;
        --t;
        System.out.println(t);



    }
}
