package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import java.util.*;

public class Main {

    static void vyprazdenie(Map<String, String> slovnik) {
        /*
        for(Iterator<String> iterator = slovnik.keySet().iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            if(slovnik.size() > 0) {
                iterator.remove();
            }

        */

        var iterator = slovnik.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            iterator.remove();
        }
    }


    static void pridavanie(Map<String, String> slovnik) {
        int pocet = ZKlavesnice.readInt("Zadaj kolko slov chces zadat");
        int i = 0;
        while(i < pocet){
            String slovo = ZKlavesnice.readString("Zadaj slovo");
            while (slovnik.containsKey(slovo)) {
                System.out.println("Slovo sa uz v slovniku nachadza, zadaj ine slovo");

                slovo = ZKlavesnice.readString("Zadaj slovo");
            }

            String preklad = ZKlavesnice.readString("Zadaj preklad slova");
            slovnik.put(slovo, preklad);
            i++;
        }
    }

    static void citanie(Map<String, String> mapa){
        String slovo = ZKlavesnice.readString("Zadaj hladane slovo");
        if(mapa.containsKey(slovo)){
            System.out.println(mapa.get(slovo));
        }
        else {
            System.out.println("Slovo sa tam nechadza");
        }

    }

    static void mazanie (Map<String, String> mapa){
        String slovo = ZKlavesnice.readString("Zadaj slovo, co chces zmazat");
        if(mapa.containsKey(slovo)){
            mapa.remove(slovo);
        }
        else {
            System.out.println("Take slovo sa tam nenachadza");
        }
    }
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

        //dvojromerne pole
        /*
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
        }*/

        //Triedenie
        /*
        List<Zivocich> list = new ArrayList<>();
        int n = ZKlavesnice.readInt("Zadaj pocet zivocichov") ;
        for(int i = 0; i < n; i++){
            int c = ZKlavesnice.readInt("Zadaj 1 pre cloveka, 2 pre psa");
            if (c == 1){
                String meno = ZKlavesnice.readString("Zadaj meno cloveka");
                String priezvisko = ZKlavesnice.readString("Zadaj priezvisko cloveka");
                int vek = ZKlavesnice.readInt("Zadaj vek cloveka");
                list.add(new Clovek(meno, priezvisko, vek));
            }
            else if (c == 2){
                String meno = ZKlavesnice.readString("Zadaj meno psa");
                int vek = ZKlavesnice.readInt("Zadaj vek psa");
                list.add(new Pes(meno, vek));
            }

            else{
                System.out.println("Chyba");
            }
        }

        for(var elem: list){
            if (elem.getClass()==Clovek.class){
                System.out.println(((Clovek) elem).krstne_meno + " " + ((Clovek) elem).priezvisko);
            }
            else {
                System.out.println(((Pes)elem).meno);
            }
        }

        Comparator<Zivocich> comparator = new Comparator<Zivocich>()
        {
            @Override
            public int compare(Zivocich o1, Zivocich o2) {
                if (o1.getClass() == o2.getClass()) {
                    if (o1.getClass() == Clovek.class) {
                        return ((Clovek) o1).vek - ((Clovek) o2).vek;
                    } else {
                        return ((Pes) o1).vek - ((Pes) o2).vek;
                    }
                } else {
                    return o1.pocet_noh - o2.pocet_noh;

                }
            }
        };

        Collections.sort(list,comparator);

        System.out.println();

        for(var elem: list){
            if (elem.getClass()==Clovek.class){
                System.out.println(((Clovek) elem).krstne_meno + " " + ((Clovek) elem).priezvisko);
            }
            else {
                System.out.println(((Pes)elem).meno);
            }
        }*/

        Map<String, String> slovnik = new HashMap<>();
        slovnik.put("Yes", "Ano");
        slovnik.put("No", "Nie");
        slovnik.put("object oriented programming", "oop");

        pridavanie(slovnik);

        for (var elem:slovnik.keySet()){
            System.out.println(elem+ " " + slovnik.get(elem));

        }

        citanie(slovnik);
        mazanie(slovnik);
        for (var elem:slovnik.keySet()){
            System.out.println(elem+ " " + slovnik.get(elem));

        }

        vyprazdenie(slovnik);
    }
}
