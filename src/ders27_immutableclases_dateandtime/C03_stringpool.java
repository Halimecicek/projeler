package ders27_immutableclases_dateandtime;

public class C03_stringpool {
    public static void main(String[] args) {
        String a="";
        a+=2;
        a+='c';
        a+=false;
        if (a=="2cfalse") System.out.println("==");

        if (a.equals("2false")) System.out.println("equals");

    }
}
