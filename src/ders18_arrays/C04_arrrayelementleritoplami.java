package ders18_arrays;

public class C04_arrrayelementleritoplami {
    public static void main(String[] args) {
        // verilen bir arraydeki pozitif tam sayilari toplayip
        // sonucu bize donduren bir method yaziniz

        int[]arr= {3,-3,5,-7,-6,1,-2};

    }

    public static int pozitifelementleritopla(int[]arr){
        int toplam =0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                toplam +=arr[i];
            }

        }
        return toplam;

    }
}
