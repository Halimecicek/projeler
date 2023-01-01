package ders28_varags_stringbuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder(7);

        sb.append("java");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);

        sb.append("guzeldir");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" ona ne suphe");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        // kapasite ve lengt i esitlemek istersek
        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

    }
}
