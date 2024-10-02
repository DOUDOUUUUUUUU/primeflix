package entity;

import user.Producteur;

import java.util.ArrayList;

public class Serie extends Entity {

    private int nbEpisodes;

    private ArrayList<Episode> episodes;
    public Serie(int id, String nomEntity, String synopsis, ArrayList<String> casting, Producteur prod, int legalAge) {
        super(id, nomEntity, synopsis, casting, prod, legalAge);
        this.nbEpisodes = 0;
        this.episodes = new ArrayList<>();
    }

    public void addEpisodes(Episode ep) {
        episodes.add(ep);
        nbEpisodes++;
    }

    public int getNbEpisodes() {
        return nbEpisodes;
    }
}
