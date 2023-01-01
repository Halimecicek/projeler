package ders22_arraylist;

public class C04_Foreachloop {
    public static void main(String[] args) {
        int[]arr={3,5,7,8,4,2,6,9,6,4,5};
        //  bu arraydaki 5 den butyuk olan tum elemanlari toplayin

        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>5){
                toplam+=arr[i];

            }

        }
        System.out.println("for loop ile:"+ toplam);
        //  for-each loop daha basit bir kurgu ile calisir
        // for-each loop 3 seviye soylemeniz lazim
        // hangi data turunde degiskenle ugrasacagi
        // loop un icerisinde herbir elelman geldiginde hangi islem yapacaksiniz
        // hangi array ve collection dan elemanlar gelecek
        toplam=0;

        for (int each: arr
        ){
            if (each>5){
                toplam+=each;
        }

        }
    }
}
