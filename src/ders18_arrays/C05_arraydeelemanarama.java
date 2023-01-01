package ders18_arrays;

public class C05_arraydeelemanarama {
    public static void main(String[] args) {
        // verilen bir arrayde istenen bir eleman var olup
        // olmadigini varsa kac kere kulllanildigini yazdiran bir method olusturun

        int []arr= {1,2,3,4,5,3,6,7,4,2,3,5,1,3,2};
        int arananeleman=2;

        elemanara(arr,arananeleman);
    }
    public static void elemanara(int[]arr, int arananeleman){

        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==arananeleman){
                sayac++;
            }

        }
        if(sayac==0){
            System.out.println("aranan sayi arrayde yok ");
        }else{
            System.out.println("aranan"+arananeleman+"sayisi arrayde"+sayac+"kere kullanilmis");
        }
    }
}
