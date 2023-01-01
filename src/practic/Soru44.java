package practic;

public class Soru44 {

    //İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.

    public static void main(String[] args) {

        String[] arr = new String[]{"alabama", "pick", "sos", "sets","pex"};


        for (int i = 0; i < arr.length ; i++) {
            String ilkharf=arr[i].substring(0,1);
            String sonharf=arr[i].substring(arr[i].length()-1);
            if(ilkharf.equals(sonharf)){
                System.out.println(arr[i]);
            }

        }

    }
}
