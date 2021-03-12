package sk.stuba.fei.uim.oop;

public class Clovek extends Zivocich{
    String krstne_meno;
    String priezvisko;
    int vek;
    public Clovek(String krstne_meno, String priezvisko, int vek){
        this.pocet_noh = 2;
        this.krstne_meno = krstne_meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
    }
    @Override
    void zvuk() {
        System.out.println("Ahoj, ako sa mas?");
    }
}
