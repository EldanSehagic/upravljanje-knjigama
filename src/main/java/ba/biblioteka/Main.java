package ba.biblioteka;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

        for(Knjiga k : biblioteka.values()){
            System.out.println("ISBN: "+k.getISBN());
            String tip = (k instanceof RijetkaKnjiga)?"Rijetka":"Obicna";
            System.out.println("Tip: "+tip);
            System.out.println("Status: "+k.getStatus());
            System.out.println("Vrijednost knjige: "+k.izracunajVrijednost());
            System.out.println("----------------------------");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ISBN za pretragu: ");
        String trISBN = sc.nextLine();

        if(biblioteka.containsKey(trISBN)){
            Knjiga k = biblioteka.get(trISBN);
            System.out.println("ISBN: "+k.getISBN());
            String tip = (k instanceof RijetkaKnjiga)?"Rijetka":"Obicna";
            System.out.println("Tip: "+tip);
            System.out.println("Status: "+k.getStatus());
            System.out.println("Vrijednost knjige: "+k.izracunajVrijednost());
        }else{
            System.out.println("Knjiga sa ISBN: " + trISBN + " ne postoji.");
        }
        double ukupno = 0;
        for(Knjiga k : biblioteka.values()){
            ukupno += k.izracunajVrijednost();
        }
        System.out.println("Vrijednost svih knjiga: "+ukupno);
    }
}
