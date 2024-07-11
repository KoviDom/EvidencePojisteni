package projekt.evidencepojisteni;

public class Pojisteny {

    private String jmeno;
    private String prijmeni;
    private int vek;
    private int telefonniCislo;

    public Pojisteny(String jmeno, String prijmeni, int vek, int telefonniCislo) {
        if (jmeno == null || jmeno.trim().isEmpty()) {
            throw new IllegalArgumentException("Jméno musí být vyplněno!");
        }
        if (prijmeni == null || prijmeni.trim().isEmpty()) {
            throw new IllegalArgumentException("Příjmení musí být vyplněno!");
        }
        if (vek <= 0) {
            throw new IllegalArgumentException("Věk musí být kladný!");
        }
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    public String toString() {
        return jmeno + "    " + prijmeni + "    " + vek + "    " + telefonniCislo;
    }

}
