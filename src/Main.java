import entity.Episode;
import entity.Film;
import entity.Serie;
import user.Consommateur;
import user.Producteur;

import java.util.ArrayList;

public class Main { // TODO: link to HMI
    public static void main(String[] args) {
        //SQLAccess.connect("3306", "localhost", "root", "root");
        Producteur pro1 = new Producteur("pro1", 0);
        Producteur pro2 = new Producteur("pro2", 0);
        Serie ser1 = new Serie(1, "Serie 1", "synopsis", new ArrayList<>(), pro2, 7);
        Film film1 = new Film(5, "film1", 84, "synopsis", new ArrayList<>(), pro1, 16);
        Film film2 = new Film(6, "film2", 340, "synopsis", new ArrayList<>(), pro2, 12);
        Film film3 = new Film(7, "film3", 100, "synopsis", new ArrayList<>(), pro1, 21);
        Episode ep1 = new Episode(1, 1, "ep1nom", 32);
        Episode ep2 = new Episode(1, 2, "ep2nom", 34);
        Episode ep3 = new Episode(1, 3, "ep3nom", 24);
        Episode ep4 = new Episode(1, 4, "ep4nom", 36);



        Consommateur con1 = new Consommateur("con1", "con1prenom", 0.5);
        Consommateur con2 = new Consommateur("con2", "con2prenom", 0.9);

        con1.watchFilm(film1);
        con1.watchEpisode(ep1);
        pro2.addSolde(con1.paiement());





    }
}
