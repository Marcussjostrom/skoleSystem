import java.util.ArrayList;

public class studenter extends skoleSystem{

    private final String navn;
    private final String land;
    private final String utdanning;
    private final int alder;

    public studenter(String navn, String land, String utdanning, int alder, String s) {
        this.navn = navn;
        this.land = land;
        this.utdanning = utdanning;
        this.alder = alder;
    }

    public String getNavn() {
        return navn;
    }

    public String getLand() {
        return land;
    }

    public String getUtdanning() {
        return utdanning;
    }

    public int getAlder() {
        return alder;
    }

    public void display() {
        System.out.println("\t" + "\t" + "Navn: " + getNavn());
        System.out.println("\t" + "\t"+ "Utdanning: " + getUtdanning());
        System.out.println("\t" + "\t" + "Født i: " + getLand());
        System.out.println("\t" + "\t" + "Alder: " + getAlder());
        System.out.println(" ");

    }

}
