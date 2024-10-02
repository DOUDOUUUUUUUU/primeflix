package user;

import entity.*;

import java.util.ArrayList;

public class Consommateur extends User {
    //Attributes
    private int age;
    private String prenom;
    private ArrayList<ArrayList> listplayList;
    private double currentTarif;

    private int visionnage;

    //Constructor
    public Consommateur(String name, String prenom, double currentTarif) {
        super(name, 0);
        this.prenom = prenom;
        this.currentTarif = currentTarif;
        this.visionnage = 0;
    }

    //Methods

    public void watchFilm(Film f) {
        this.visionnage += f.getDuree();
    }
    public void watchEpisode(Episode e) {
        this.visionnage += e.getDuree();
    }

    public void addSolde(double solde) {
        this.solde += solde;
    }

    public void setCurrentTarif(double tarif) {
        this.currentTarif = tarif;
    }

    public void createPlayList(ArrayList<Entity> name) {        //WIP
        this.listPlayList.add(name);
    }

    public void putEpisode(int numPlay,Entity entity) {         //WIP
        this.listPlayList.get(numPlay).add(entity);
    }

    public double paiement() {
        double tot = this.visionnage * this.currentTarif;
        this.visionnage = 0;
        return (tot);
    }
}
 