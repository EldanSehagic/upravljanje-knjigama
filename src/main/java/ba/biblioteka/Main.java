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
    }
}
