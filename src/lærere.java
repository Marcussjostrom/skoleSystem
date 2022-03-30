import java.util.ArrayList;

public class lærere extends skoleSystem {

    private final String lærer;
    private final String linje;
    private final String telefon;
    private final int aldEr;

    public lærere(String lærer, String linje, String telefon, int aldEr) {
        this.lærer = lærer;
        this.linje = linje;
        this.telefon = telefon;
        this.aldEr = aldEr;

    }
    public String getLærer() {
        return lærer;
    }

    public String getLinje() {
        return linje;
    }

    public String getTelefon() {
        return telefon;
    }

    public int getAldEr() {
        return aldEr;
    }
    public void display() {
        System.out.println("\t" + "\t" + "Navn: " + getLærer());
        System.out.println("\t" + "\t" + "Har ansvaret for: " + getLinje());
        System.out.println("\t" + "\t" + "Alder: " + getAldEr());
        System.out.println("\t" + "\t" + "Telefon: " + getTelefon());
        System.out.println(" ");
    }

}

