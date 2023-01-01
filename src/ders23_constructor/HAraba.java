package ders23_constructor;

public class HAraba {

    String marka = "marka belirtilmeedi";
    String model = "model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public HAraba(String mrk, String mdl, String ykt, int yl, int fyt){
     marka=mrk;
     model=mdl;
     yakit=ykt;
     yil=yl;
     fiyat=fyt;


    }
    
    public HAraba(){
        // gorunur durumdaki parametresiz consructor
        // defolt consructor degildir
        // defolrt consractor in badye kod yazilir
        // ancak parametresiz constructor da bady kod yazilir

        // parametresiz consructor in bady sinde kod yoksa
        // defolt consructor ile ayni islevi gorur
        // ama yine de gorunur durumda ise defolt consructor denmez
    }



// biz gozle gorunur  herhangi bir constructor olusturdugumuzdA
// java defolt constructor u siler
    // bu durumda daha once olusturulmus olan objelerin sorun olmamasi
    // class a parametresiz bir consructor eklemeniz faydali olur
        public String toString() {
            return "Araba Ozellikleri " +
                    "\nmarka : " + marka +
                    "\nmodel : " + model +
                    "\nyakit : " + yakit +
                    "\nyil : " + yil +
                    "\nfiyat : " + fiyat;
        }


        public int maxhiz(String yakit) {
            int maxhiz = 120;

            if (yakit.equalsIgnoreCase("dizel")) {
                maxhiz = 200;

            } else if (yakit.equalsIgnoreCase("benzin")) {
                maxhiz = 230;
            } else if (yakit.equalsIgnoreCase("elektrikli")) {
                maxhiz = 180;

            }
            return maxhiz;
        }
    }

