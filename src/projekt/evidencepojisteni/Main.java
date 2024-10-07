package projekt.evidencepojisteni;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static EvidencePojistenych evidencePojistenych = new EvidencePojistenych();

    public static void main(String[] args) {
        boolean pokracuje = true;

        System.out.println("------------------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("------------------------------------");

        while (pokracuje) {
            vypisMenu();
            int volba = Integer.parseInt(scanner.nextLine().trim());

            switch (volba) {
                case 1 -> pridatPojistenyho();
                case 2 -> vypsatVsechnyPojistene();
                case 3 -> vyhledatPojisteneho();
                case 4 -> {
                    pokracuje = false;
                    System.out.println("Konec");
                }
                default -> System.out.println("Neplatná volba. Zkuste to znovu.");
            }
        }
    }

    private static void vypisMenu() {
        System.out.println("Vyberte si akci: ");
        System.out.println("1 - Přidat nového pojištěného");
        System.out.println("2 - Vypsat všechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
    }

    private static void pridatPojistenyho() {
        String jmeno = zadejJmeno();
        String prijmeni = zadejPrijmeni();
        String telefonniCislo = zadejTelefonniCislo();
        int vek = zadejVek();

        evidencePojistenych.pridatPojistenyho(jmeno, prijmeni, vek, telefonniCislo);
        System.out.println("Data byla uložena.");
    }

    private static void vypsatVsechnyPojistene() {
        if (evidencePojistenych.vypsatVsechnyPojistene().isEmpty()) {
            System.out.println("Seznam je prázdný.");
        } else {
            System.out.println("Seznam všech pojištěných:");
            for (Pojisteny pojisteny : evidencePojistenych.vypsatVsechnyPojistene()) {
                System.out.println(pojisteny);
            }
        }
    }

    private static void vyhledatPojisteneho() {
        String jmeno = zadejJmeno();
        String prijmeni = zadejPrijmeni();
        Pojisteny pojisteny = evidencePojistenych.vyhledatPojisteneho(jmeno, prijmeni);
        if (pojisteny != null) {
            System.out.println(pojisteny);
        } else {
            System.out.println("Pojištěný nebyl nalezen.");
        }
    }

    private static String zadejJmeno() {
        System.out.println("Zadejte jméno pojištěného: ");
        return scanner.nextLine().trim();
    }

    private static String zadejPrijmeni() {
        System.out.println("Zadejte příjmení: ");
        return scanner.nextLine().trim();
    }

    private static String zadejTelefonniCislo() {
        String telefonniCislo;
        while (true) {
            System.out.println("Zadejte telefonní číslo (9 číslic): ");
            telefonniCislo = scanner.nextLine().trim();
            if (telefonniCislo.matches("\\d{9}")) {
                break;
            } else {
                System.out.println("Neplatné telefonní číslo. Zkuste to znovu.");
            }
        }
        return telefonniCislo;
    }

    private static int zadejVek() {
        int vek;
        while (true) {
            System.out.println("Zadejte věk: ");
            try {
                vek = Integer.parseInt(scanner.nextLine().trim());
                if (vek > 0) {
                    break;
                } else {
                    System.out.println("Věk musí být kladný. Zkuste to znovu.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Neplatný věk. Zkuste to znovu.");
            }
        }
        return vek;
    }

}
