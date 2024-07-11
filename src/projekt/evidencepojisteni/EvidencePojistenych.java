package projekt.evidencepojisteni;

import java.util.ArrayList;
import java.util.Scanner;

public class EvidencePojistenych {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Pojisteny> seznamPojistenych = new ArrayList<>();

    public void pridatPojistenyho() {

        System.out.println("Zadejte jméno pojištěnýho: ");
        String jmeno = scanner.nextLine();
        System.out.println("Zadejte příjmení: ");
        String prijmeni = scanner.nextLine();
        System.out.println("Zadejte telefonní číslo: ");
        String telefonniCislo = scanner.nextLine();
        System.out.println("Zadejte věk: ");
        int vek = Integer.parseInt(scanner.nextLine());

        Pojisteny pojisteny = new Pojisteny(jmeno, prijmeni, vek, telefonniCislo);
        seznamPojistenych.add(pojisteny);

        System.out.println();
        System.out.println("Data byla uložena. Pokračujte libovolnou klávesou...");
        System.out.println();

    }

    public void vypsatVsechnyPojistene() {

        if (seznamPojistenych.isEmpty()) {
            System.out.println("Seznam je prázdný.");
        } else {
            System.out.println("Seznam všech pojištěných:");
            for (Pojisteny seznam : seznamPojistenych) {
                System.out.println(seznam);
            }
        }
        System.out.println("Pokračujte libovolnou klávesou...");
        System.out.println();

    }

}
