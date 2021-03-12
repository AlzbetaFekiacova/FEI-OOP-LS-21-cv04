package sk.stuba.fei.uim.oop;

public class Pes extends Zivocich {
    String meno;
    int vek;
    public Pes(String meno, int vek){
        this.meno = meno;
        this.vek = vek;
        this.pocet_noh = 4;
    }
    @Override
    void zvuk() {
        System.out.println("Hav Hav");
    }
}
