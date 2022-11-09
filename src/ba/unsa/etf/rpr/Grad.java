package ba.unsa.etf.rpr;

public enum Grad {


    ZENICA("032"),
    SARAJEVO("033"),

    TUZLA("035"),
    MOSTAR("036"),
    BIHAC("037");



    private final java.lang.String pozivni;
    Grad(String pozivni) {
        this.pozivni = pozivni;
    }

    public String getPozivni() {

        return pozivni;
    }

    @Override
    public String toString() {
        return this.getPozivni();
    }
}

//atribut,konstruktor,toString

