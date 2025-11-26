package ba.biblioteka;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        Map<String,Knjiga> biblioteka = new HashMap<>();

        ObicnaKnjiga o1 = new ObicnaKnjiga("E111",60);
        ObicnaKnjiga o2 = new ObicnaKnjiga("E112",50);
        RijetkaKnjiga r1 = new RijetkaKnjiga("R111",90);
        RijetkaKnjiga  r2 = new RijetkaKnjiga("R112",120);

        biblioteka.put(o1.getISBN(),o1);
        biblioteka.put(o2.getISBN(),o2);
        biblioteka.put(r1.getISBN(),r1);
        biblioteka.put(r2.getISBN(),r2);

        o1.azurirajStatus("Posudzena");
        o2.azurirajStatus("Dostupna");
        r1.azurirajStatus("Rezervisana");
        r2.azurirajStatus("Rezervisana");
    }
}
