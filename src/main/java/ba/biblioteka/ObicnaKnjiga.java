package ba.biblioteka;

public class ObicnaKnjiga extends Knjiga implements Status {
    @Override
    public double izracunajVrijednost() {
        return 0;
    }

    public ObicnaKnjiga(String ISBN, double brojStranica) {
        super(ISBN, brojStranica);
    }


    @Override
    public void azurirajStatus(String status) {

    }

    @Override
    public String getStatus() {
        return "";
    }
}
