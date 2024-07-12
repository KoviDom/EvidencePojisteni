package projekt.evidencepojisteni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EvidencePojistenych evidencePojistenych = new EvidencePojistenych();
        boolean pokracuje = true;

        System.out.println("------------------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("------------------------------------");

        System.out.println();
        while (pokracuje) {
            System.out.println("Vyberte si akci: ");
            System.out.println("1 - Přidat nového pojištného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            int volba = Integer.parseInt(scanner.nextLine().trim());

            switch (volba) {
                case 1:
                    evidencePojistenych.pridatPojistenyho();
                    break;
                case 2:
                    evidencePojistenych.vypsatVsechnyPojistene();
                    break;
                case 3:
                    evidencePojistenych.vyhledatPojisteneho();
                    break;
                case 4:
                    pokracuje = false;
                    System.out.println("Konec");
                    break;
                default:
                    System.out.println("Neplatná volba. Zkuste to znovu:");
            }

        }

    }

}
