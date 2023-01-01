package ders04_matematikselislemler;

public class C08_pre_post_increment {
    public static void main(String[] args) {
        int x=3;
        int y=2* ++x;
        int z= 5+y--;
        System.out.println(x+y+z);

    }
}
