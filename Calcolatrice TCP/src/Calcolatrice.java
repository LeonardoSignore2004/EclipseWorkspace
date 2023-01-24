public class Calcolatrice {

    private double a;
    private double b;

    Calcolatrice(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double somma() {
        return a + b;
    }

    public double sottrazione() {
        return a - b;
    }

    public double divisione() {
        return a / b;
    }

    public double moltiplicazione() {
        return a * b;
    }

}