public class Triangolo extends Forma{
    public Triangolo(double base, double altezza) {
        super(base, altezza);
    }
    @Override
    void calcolaArea() {
        System.out.println("L'area del triangolo è: " + base*altezza/2);
    }
}
