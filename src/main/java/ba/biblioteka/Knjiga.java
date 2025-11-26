package ba.biblioteka;

public abstract class Knjiga {
    protected String ISBN;
    protected double brojStranica;
    protected String status;

    public abstract double izracunajVrijednost();

    public Knjiga(String ISBN, double brojStranica) {
        this.ISBN = ISBN;
        this.brojStranica = brojStranica;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getBrojStranica() {
        return brojStranica;
    }

    public String getStatus() {
        return status;
    }
}
