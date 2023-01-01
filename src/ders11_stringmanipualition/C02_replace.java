package ders11_stringmanipualition;

public class C02_replace {
    public static void main(String[] args) {
        String str= "java candir";
        System.out.println(str.replace('a', 'A')); // jAvA cAndir
        System.out.println(str.replace(' ','_'));
        System.out.println(str.replace("candir","cok guzeldir"));
        // tum a lari silin
        System.out.println(str.replace(("a"),"" ));
        //sadece birinci a yi  A degistirin
        System.out.println(str.replaceFirst("a","A"));



    }
}
