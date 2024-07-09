package projekt.evidencepojisteni;

import java.util.Scanner;

public class EvidencePojistenych {

    Scanner scanner = new Scanner(System.in);

    public void pridatPojistenyho() {

        System.out.println("Zadejte jméno pojištěnýho: ");
        String jmeno = scanner.nextLine();
        System.out.println("Zadejte příjmení: ");
        String prijmeni = scanner.nextLine();
        System.out.println("Zadejte telefonní číslo: ");
        String telefonniCislo = scanner.nextLine();
        System.out.println("Zadejte věk: ");
        int vek = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("Data byla uložena. Pokračujte libovolnou klávesou...");
        System.out.println();

    }

}
