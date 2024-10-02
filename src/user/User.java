package user;

public abstract class User {
    private String nom;

    protected double solde;

    public User(String nom, double solde) {
        this.nom = nom;
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }
}
