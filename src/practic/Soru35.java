package practic;

public class Soru35 {
    public static void main(String[] args) {
        //Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
        //Örneğin;Hello==>Heo


        String str="Hello";


        for (int i = 0; i <str.length() ; i++) {
            String tekrarsiz=str.substring(i,i+1);

            if(str.indexOf(tekrarsiz)==str.lastIndexOf(tekrarsiz)){
                System.out.println(tekrarsiz);


            }

        }




    }
}
