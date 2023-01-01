package ders47_Mapsmethodlari;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMap {
    public static void main(String[] args) {
        TreeMap<String ,Integer> mp1=new TreeMap<>();
        mp1.put("A",5);
        mp1.put("H",3);
        mp1.put("C",7);
        mp1.put("T",3);
        mp1.put("F",8);
        System.out.println(mp1);
        System.out.println(mp1.higherKey("D"));
        System.out.println(mp1.higherKey("H"));
        System.out.println(mp1.higherKey("U"));


        System.out.println(mp1.higherEntry("M"));

        System.out.println(mp1.floorKey("D"));
        System.out.println(mp1.floorKey("H"));


        System.out.println(mp1.headMap("F"));
        System.out.println(mp1.headMap("K"));
        System.out.println(mp1.headMap("F",true));
        System.out.println(mp1.headMap("N",true));


        System.out.println(mp1.tailMap("F"));
        System.out.println(mp1.tailMap("D"));
        System.out.println(mp1.tailMap("F"));

        System.out.println(mp1.descendingMap());

        System.out.println(mp1.firstKey()); // A
        System.out.println(mp1.firstEntry()); // A=5
        System.out.println(mp1.lastKey()); // T
        System.out.println(mp1.lastEntry()); // T=3
        System.out.println(mp1.pollFirstEntry()); // A=5
        System.out.println(mp1); // {C=7, F=8, H=3, T=3}
        System.out.println(mp1.pollLastEntry()); // T=3
        System.out.println(mp1); // {C=7, F=8, H=3}
        System.out.println(mp1.subMap("B", "G")); // {C=7, F=8}
        System.out.println(mp1.subMap("C","H")); // {C=7, F=8}  baslangic inclusive, bitis exclusive
        System.out.println(mp1.subMap("C", false, "H", true));
        // {F=8, H=3}




    }
}
