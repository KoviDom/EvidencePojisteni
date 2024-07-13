package projekt.evidencepojisteni;

public class Pojisteny {

    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefonniCislo;

    //Konstruktor
    public Pojisteny(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        if (jmeno == null || jmeno.trim().isEmpty()) {
            throw new IllegalArgumentException("Jméno musí být vyplněno!");
        }
        if (prijmeni == null || prijmeni.trim().isEmpty()) {
            throw new IllegalArgumentException("Příjmení musí být vyplněno!");
        }
        if (vek <= 0) {
            throw new IllegalArgumentException("Věk musí být kladný!");
        }
        if (telefonniCislo == null || telefonniCislo.trim().isEmpty() || !telefonniCislo.matches("\\d{9}")) {
            throw new IllegalArgumentException("Telefonní číslo musí mít 9místné číslo!");
        }
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public String getTelefonniCislo() {
        return telefonniCislo;
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni + " " + vek + " " + telefonniCislo;
    }

}
