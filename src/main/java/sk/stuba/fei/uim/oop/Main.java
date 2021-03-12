package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<String> slova = new ArrayList<>();
        ArrayList<Integer> cisla = new ArrayList<>();
        ArrayList<Zivocich> zivocichy = new ArrayList<>();

        int cislo = ZKlavesnice.readInt("Zadaj pocet prvkov: ");
        int ake_prvky = ZKlavesnice.readInt("Zadaj 1 pre slova, 2 pre cisla a 3 pre zivochy: ");


        for(int i = 0; i < cislo; i++){
           if (ake_prvky == 1) {
               slova.add(ZKlavesnice.readString("Zadaj slovo: "));
           }
            else if (ake_prvky == 2)
            {
                    cisla.add(ZKlavesnice.readInt("Zadaj cislo: "));
            }
            else if (ake_prvky == 3){
                int volba = ZKlavesnice.readInt("Zadaj jedna pre psa a 2 pre cloveka: ");
                if (volba == 1){
                    zivocichy.add(new Pes());
                }
                else if(volba == 2){
                    zivocichy.add(new Clovek());
                }
                else {
                    System.out.println("Zadavaj len 1 alebo dva");
                    return;
                }
           }
            else
           {
               System.out.println("Ine pole sa neda");
               return;
           }


        }
        if (ake_prvky == 1){
            for (var elem:slova){
                System.out.println(elem);
            }
        }
        else if(ake_prvky ==2){
            for(var elem:cisla){
                System.out.println(elem);
            }

        }
        else {
            for (var elem:zivocichy){
                System.out.println(elem.pocet_noh);
            }
        }
*/

        //nprvkove pole
        /*
        int n = ZKlavesnice.readInt("Zadaj prirodzene cislo: ");
        int k = ZKlavesnice.readInt("Zadaj k, prirodzene cislo");
        while(n < 2*k  || k < 1){
            System.out.println("Nespravne: K musi byt viac ako 1 a n viac ako 2xk");
            n = ZKlavesnice.readInt("Zadaj prirodzene cislo: ");
            k = ZKlavesnice.readInt("Zadaj k, prirodzene cislo");
        }

        ArrayList<Integer> ncisel = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            ncisel.add(i);
        }

        Iterator<Integer>iterator = ncisel.iterator();
        int p = 0;
        while(iterator.hasNext()){
            var item = iterator.next();
            if (p % k == 0){
                iterator.remove();
            }
            p++;
        }

        for (var elem:ncisel){
            System.out.println(elem);
        }*/

        List<List<Integer>> dvojrozmerne_pole = new ArrayList<>();
        int r = ZKlavesnice.readInt("Zadaj pocet riadkov");
        int s = ZKlavesnice.readInt("Zadaj pocet stlpcov");
        int c;
        for (int i = 0; i < r; i++){
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int j =0; j < s; j++){
                c = ZKlavesnice.readInt("Zadaj cislo, co chces pridat:");
                tmp.add(c);
            }
            dvojrozmerne_pole.add(tmp);
        }

        for (var elem:dvojrozmerne_pole){
            for (var e:elem){
                System.out.println(e + " ");
            }
            System.out.println();
        }
    }
}
