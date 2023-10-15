public class Rettangolo extends Forma{
    public Rettangolo(double base, double altezza) {
        super(base, altezza);
    }

    @Override
    void calcolaArea() {
        System.out.println("L'area del rettangolo è: " + base*altezza);
    }
}

