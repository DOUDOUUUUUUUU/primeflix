package user;

import entity.Entity;
import java.util.ArrayList;

public class Producteur extends User {
    private ArrayList<Entity> production;

    public Producteur(String nom, double solde) {
        super(nom, solde);
    }


    public void addSolde(double solde) {
        this.solde += solde;
    }

}
