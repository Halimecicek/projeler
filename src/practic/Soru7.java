package practic;

public class Soru7 {
    public static void main(String[] args) {
         /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
        */
        char not='A';

        System.out.println(not=='A'?"GAYET BASARILI":not=='B'?"BASARILI":not=='C'?"HA GAYRET": "DIGERLERI");
    }
}
