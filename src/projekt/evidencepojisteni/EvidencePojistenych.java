package projekt.evidencepojisteni;

import java.util.ArrayList;
import java.util.List;

public class EvidencePojistenych {

    private List<Pojisteny> seznamPojistenych = new ArrayList<>();

    /**
     * Přidá se pojištěný do seznamu
     * @param jmeno
     * @param prijmeni
     * @param vek
     * @param telefonniCislo
     */
    public void pridatPojistenyho(String jmeno, String prijmeni, int vek, String telefonniCislo) {

        Pojisteny pojisteny = new Pojisteny(jmeno, prijmeni, vek, telefonniCislo);
        seznamPojistenych.add(pojisteny);

    }

    /**
     * Vypíše všechny pojištěné, co jsou ve seznamu
     * @return vypise seznam pojistenych
     */
    public List<Pojisteny> vypsatVsechnyPojistene() {

        return seznamPojistenych;

    }

    /**
     * Vyhledá pojištěnýho, který je v seznamu
     * @param zadejJmeno
     * @param zadejPrijmeni
     * @return vyhledá bud jmena pojistenych, kteri jsou v seznamu nebo vyhodi null
     */
    public Pojisteny vyhledatPojisteneho(String zadejJmeno, String zadejPrijmeni) {
        for (Pojisteny pojisteny : seznamPojistenych) {
            if (pojisteny.getJmeno().equalsIgnoreCase(zadejJmeno) &&
                    pojisteny.getPrijmeni().equalsIgnoreCase(zadejPrijmeni)) {
                return pojisteny;
            }
        }
        return null;  // Pojištěný nebyl nalezen
    }

    /**
     * Formátování textu při výpisu nebo vyhledávání pojištěných
     * @param seznam
     */
    private void formatovaniTextu(Pojisteny seznam) {
        System.out.printf("%-10s %-10s %-5d %-10s%n", seznam.getJmeno(), seznam.getPrijmeni(), seznam.getVek(), seznam.getTelefonniCislo());
    }

}
