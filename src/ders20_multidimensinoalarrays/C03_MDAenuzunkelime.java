package ders20_multidimensinoalarrays;

public class C03_MDAenuzunkelime {
    public static void main(String[] args) {
        // verilen mda string bir arraydeki en uzun string i bulan kod yaziniz
        String [][]arr={{"ilker","nesrin"},{"hasan","heysen","adem","yusuf enes"}};
        String enuzunkelime=arr[0][0];
        for (int i = 0; i <arr.length ; i++) {  // outer  arrayin elemanlarini kontrol eder
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].length() > enuzunkelime.length()) {
                    enuzunkelime = arr[i][j];

                }
            }

        }
        System.out.println("En uzun kelime : " + enuzunkelime);
    }
}
