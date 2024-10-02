package entity;

public class Episode {
    private int SerieID; // usefull for the database implementation
    private int numEpisode;
    private String nomEpisode;
    private int duree;

    public Episode(int serieID, int numEpisode, String nomEpisode, int duree) {
        SerieID = serieID;
        this.numEpisode = numEpisode;
        this.nomEpisode = nomEpisode;
        this.duree = duree;
    }

    public int getDuree() {
        return duree;
    }
}
