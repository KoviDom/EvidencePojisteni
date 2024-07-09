package projekt.evidencepojisteni;

public class Pojisteny {

    private String jmeno;
    private String prijmeni;
    private int vek;
    private int telefonniCislo;

    public Pojisteny(String jmeno, String prijmeni, int vek, int telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    public String toString() {
        return jmeno + "    " + prijmeni + "    " + vek + "    " + telefonniCislo;
    }

}
