package ders47_Mapsmethodlari;

import java.util.HashMap;
import java.util.Map;

public class C03_MapsMethodlari {
    public static void main(String[] args) {
        Map<String,Integer> mp1=new HashMap<>();
        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);

        //
        if (mp1.containsKey("C")){
            mp1.put("C",mp1.get("C")+3);
        }

        System.out.println(mp1);

        mp1.computeIfPresent("B",(k,v)->2*v);
        System.out.println(mp1);





      // map de d yoksa value si 11 olacak sekilde ekleyelim

      if (mp1.containsKey("D")) {
          mp1.put("D",11);

      }
        System.out.println(mp1);



      mp1.computeIfAbsent("E",v->8);
        System.out.println(mp1);

      // E nin degerini 4 artir

        mp1.compute("E",(k,v)->v+4);
        System.out.println(mp1);

        mp1.compute("R",(k,v)->v=3);
        System.out.println(mp1);


        mp1.compute("F",(k,v)->v*3);
        System.out.println(mp1);

    }
}
