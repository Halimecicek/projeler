package ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {
        Deque<String> dq1=new LinkedList<>();
        dq1.add("K");
        dq1.add("F");
        dq1.addLast("J");
        dq1.addFirst("A");
        System.out.println(dq1.getFirst());
        System.out.println(dq1.getLast());

        System.out.println(dq1.remove());
        System.out.println(dq1.poll());


        dq1.add("K");
        dq1.add("B");
        dq1.push("F");
        System.out.println(dq1.pop());

        System.out.println(dq1.element());
        System.out.println(dq1.peek());
        System.out.println(dq1.peekFirst());
        System.out.println(dq1.peekLast());
        System.out.println(dq1.offer("C"));
        System.out.println(dq1.offerFirst("M"));



        System.out.println(dq1);
    }
}
