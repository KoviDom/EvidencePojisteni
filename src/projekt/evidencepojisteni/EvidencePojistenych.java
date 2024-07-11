package projekt.evidencepojisteni;

import java.util.ArrayList;
import java.util.Scanner;

public class EvidencePojistenych {

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> seznamPojistenych = new ArrayList<>();
    protected Pojisteny pojisteny;

    public void pridatPojistenyho() {

        System.out.println("Zadejte jméno pojištěnýho: ");
        String jmeno = scanner.nextLine();
        System.out.println("Zadejte příjmení: ");
        String prijmeni = scanner.nextLine();
        System.out.println("Zadejte telefonní číslo: ");
        String telefonniCislo = scanner.nextLine();
        System.out.println("Zadejte věk: ");
        int vek = Integer.parseInt(scanner.nextLine());

        seznamPojistenych.add(pojisteny.toString());

        System.out.println();
        System.out.println("Data byla uložena. Pokračujte libovolnou klávesou...");
        System.out.println();

    }

    public void vypsatVsechnyPojistene() {

        System.out.println("Seznam všech pojištěných:");
        for (String seznam : seznamPojistenych) {
            System.out.println(seznam);
        }

    }

}
