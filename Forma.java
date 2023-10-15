public abstract class Forma {
    double base;
    double altezza;

    public Forma(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }
    abstract void calcolaArea();
}
