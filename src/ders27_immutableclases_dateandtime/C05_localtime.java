package ders27_immutableclases_dateandtime;

import java.time.LocalTime;

public class C05_localtime {
    public static void main(String[] args) {
        LocalTime saat= LocalTime.now();
        System.out.println(saat); // 20:17:14.702646200
        LocalTime saat2= LocalTime.of(15,10,20);
        System.out.println(saat.compareTo(saat2));
    }

}
