import java.util.ArrayList;
import java.util.List;

public class skoleSystem {
    ArrayList<studenter> studentListe = new ArrayList<>();
    ArrayList<lærere> lærerListe = new ArrayList<>();
    String[] emnearray;
    {
            emnearray = new String[]{"Skal studere Økonomi", "Skal studere Markedsføring", "Skal studere Salg", "Skal studere Frontend", "Skal studere Backend", "Skal studere Prosjektledelse"};
        }


        public void create() {
            studenter student1 = new studenter("Marcus Øksnes Sjøstrøm", "Norge", "Høyskolen i Kristiania", 25, emnearray[1] );
            studenter student2 = new studenter("Sander Jevnaker", "Norge", "Videregående", 26, emnearray[3]);
            studenter student3 = new studenter("Daniel Stuketur", "Tyskland","Universitet", 23, emnearray[5]);

            studentListe.addAll(List.of(new studenter[]{student1, student2, student3}));

            lærere lærer1 = new lærere("Roy", "Økonomi", "12345", 35);
            lærere lærer2 = new lærere("Terje", "Backend", "31231", 46);
            lærere lærer3 = new lærere("Bong lao", "Frontend", "4321312", 49);

            lærerListe.addAll(List.of(new lærere[]{lærer1, lærer2, lærer3}));

            for(studenter student : studentListe) {
                System.out.println(student.toString());
            }

            for (lærere lærere : lærerListe) {
                System.out.print(lærere.toString());
            }
        }
    }

