package ders19_arrays;

import java.util.Arrays;

public class C06_arrayeyenidegeratama {
    public static void main(String[] args) {
        String str= "java";
        str="hava";
        String[]arr1={ "ali" ,"veli"};
        String[]arr2={ "a","b","c"};
        arr1=arr2;
        System.out.println(Arrays.toString(arr1)); // [a,b,c]

        //  var olan bir arrayin uzunlugu degistirilemez
        // ama  var olan bir array e yeni bir array degeri atanabilir
        // 1 var olan bir arraye yeni deger olarak ataya biliriz

       // String[]arr1={ "ali" ,"veli"};
      //  String[]arr2={ "a","b","c"};
        arr1=arr2;
        System.out.println(Arrays.toString(arr1)); // [a,b,c]

        //2 istedigimiz uzunlukta yeni bos bir array degeri atayabiliriz
        arr1=new String[6];
        System.out.println(Arrays.toString(arr1));

        // 3 yeni olusturulan bir arraye {} icinde deger yazarak atama yazabilirseniz
        //ancak vvar olan bir array e yeni deger atamasi ici {} kullanilamaz
        // arr1={"g","h",} olmaz
    }
}
