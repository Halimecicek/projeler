package practic;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen is unvani giriniz");
        String unvan=scan.nextLine();

        if (unvan.equalsIgnoreCase("qa")){
            System.out.println();
        } else if (unvan.equalsIgnoreCase("dev")) {
            System.out.println();

        } else if (unvan.equalsIgnoreCase("ba")) {
            System.out.println();

        } else if (unvan.equalsIgnoreCase("pm")) {
            System.out.println();
        }else {
            System.out.println("lutfen gecerli unvan giriniz");
        }


    }

}
