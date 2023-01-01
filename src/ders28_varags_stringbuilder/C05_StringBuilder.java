package ders28_varags_stringbuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java candir.");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        System.out.println(sb.reverse()); // tersini yazdirir


        sb.replace(0,4,"yaaaaa");
        System.out.println(sb);

        sb.insert(18, "bu bir yalandir");
        System.out.println(sb);

        String str = "java cok guzel";

    }
}
