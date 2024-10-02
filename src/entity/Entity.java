package entity;


import user.Producteur;

import java.util.ArrayList;

public abstract class Entity {
    private int entityID;
    private String nomEntity;
    private String synopsis;
    private ArrayList<String> casting;
    private Producteur prod;
    private int legalAge;

    public Entity(int id, String nomEntity, String synopsis, ArrayList<String> casting, Producteur prod, int legalAge) {
        this.entityID = id;
        this.nomEntity = nomEntity;
        this.synopsis = synopsis;
        this.casting = casting;
        this.prod = prod;
        this.legalAge = legalAge;
    }
}
