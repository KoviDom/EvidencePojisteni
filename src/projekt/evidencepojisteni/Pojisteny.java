package projekt.evidencepojisteni;

public class Pojisteny {

    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefonniCislo;

    //Konstruktor
    public Pojisteny(String jmeno, String prijmeni, int vek, String telefonniCislo) {
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
