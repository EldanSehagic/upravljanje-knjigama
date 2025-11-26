package ba.biblioteka;

public class RijetkaKnjiga extends ObicnaKnjiga{

    public RijetkaKnjiga(String ISBN, double brojStranica) {
        super(ISBN, brojStranica);
    }

    @Override
    public double izracunajVrijednost() {
        return super.izracunajVrijednost()*2;
    }
}
