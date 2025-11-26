package ba.biblioteka;

public class ObicnaKnjiga extends Knjiga implements Status {
    private String status= "Nema status";
    @Override
    public double izracunajVrijednost() {
        return brojStranica*0.5;
    }

    public ObicnaKnjiga(String ISBN, double brojStranica) {
        super(ISBN, brojStranica);
    }


    @Override
    public void azurirajStatus(String status) {
    this.status=status;
    }

    @Override
    public String getStatus() {
        return status;
    }
}
