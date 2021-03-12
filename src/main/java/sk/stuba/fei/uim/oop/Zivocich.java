package sk.stuba.fei.uim.oop;

public abstract class Zivocich implements Comparable<Zivocich> {
    int pocet_noh;
    abstract void zvuk();

    @Override
    public int compareTo(Zivocich o) {
        return this.pocet_noh - o.pocet_noh;
    }
}
