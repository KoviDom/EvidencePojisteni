package projekt.evidencepojisteni;

import java.util.ArrayList;

public class EvidencePojistenych {

    ArrayList<Pojisteny> seznamPojistenych = new ArrayList<>();

    //Přidá se pojištěný do seznamu
    public void pridatPojistenyho(String jmeno, String prijmeni, int vek, String telefonniCislo) {

        Pojisteny pojisteny = new Pojisteny(jmeno, prijmeni, vek, telefonniCislo);
        seznamPojistenych.add(pojisteny);

    }

    //Vypíše všechny pojištěné, co jsou ve seznamu
    public void vypsatVsechnyPojistene() {

        if (seznamPojistenych.isEmpty()) {
            System.out.println("Seznam je prázdný.");
        } else {
            System.out.println("Seznam všech pojištěných:");
            for (Pojisteny seznam : seznamPojistenych) {
                formatovaniTextu(seznam);
            }
        }

    }

    //Vyhledá pojištěnýho, který je v seznamu
    public void vyhledatPojisteneho(String zadejJmeno, String zadejPrijmeni) {

        boolean najit = false;
        for (Pojisteny seznam : seznamPojistenych) {
            if ((seznam.getJmeno().equalsIgnoreCase(zadejJmeno)) && (seznam.getPrijmeni().equalsIgnoreCase(zadejPrijmeni))) {
                formatovaniTextu(seznam);
                najit = true;
                break;
            }
        }
        if (!najit) {
            System.out.println("Pojištěný nebyl nalezen.");
        }
    }

    //Formátování textu při výpisu nebo vyhledávání pojištěných
    private void formatovaniTextu(Pojisteny seznam) {
        System.out.printf("%-10s %-10s %-5d %-10s%n", seznam.getJmeno(), seznam.getPrijmeni(), seznam.getVek(), seznam.getTelefonniCislo());
    }

}
