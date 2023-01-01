package ders27_immutableclases_dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C07_periodof {
    public static void main(String[] args) {
        // dogumunuzdan bugune ne kadar zaman gecti
        LocalDate bugun = LocalDate.now();
        LocalDate dogumgunu= LocalDate.of(1991,11,04);
        Period gecensure = Period.between(dogumgunu,bugun);
        System.out.println(gecensure); //P30Y11M25D
        System.out.println(gecensure.getYears());// 30

    }
}
