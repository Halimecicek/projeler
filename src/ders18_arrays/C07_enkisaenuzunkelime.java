package ders18_arrays;

public class C07_enkisaenuzunkelime {
    public static void main(String[] args) {
        // verilen string bir arraydeki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun

        String[] arr={"hasan","adem","senturk","omer faruk"};
        enuzunenkisaisimleriyazdir(arr);
    }

    public static void enuzunenkisaisimleriyazdir(String[]arr){
        String enuzunkelime=arr[0];
        String enkisakelime=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].length()>enuzunkelime.length()){
                enuzunkelime=arr[i];

            }
            if (arr[i].length()<enkisakelime.length()){
                enkisakelime=arr[i];
            }
        }
        System.out.println("en uzun isim:"+enuzunkelime);
        System.out.println("en kisa isim:"+enkisakelime);
    }
}
