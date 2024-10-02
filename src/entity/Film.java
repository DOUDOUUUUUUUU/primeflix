package entity;

import user.Producteur;

import dbAccess.*;

import java.sql.*;
import java.util.ArrayList;

public class Film extends Entity {
    private int duree;
    public Film(int id, String nomEntity, int duree, String synopsis, ArrayList<String> casting, Producteur prod, int legalAge) {
        super(id, nomEntity, synopsis, casting, prod, legalAge);
        this.duree = duree;
    }

    public static void getAllFilm(Connection conn) { //WIP
        try {
            ResultSet res = SQLAccess.dbQuery(conn, "SELECT Entity_name, Entity_prod from Entity WHERE Entity_type = 1");
            while (true) {
                assert res != null;
                if (!res.next()) break;
                System.out.print(res.getString("Entity_name"));
                System.out.println(" by " + res.getString("Entity_producteur"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFilmByProd(Connection conn, String prod) { //WIP
        try {
            ResultSet res = SQLAccess.dbQuery(conn, "SELECT Entity_name from Entity WHERE Entity_type = 1 AND Entity_prod = " + prod);
            // TODO: check SQL injections
            while (true) {
                assert res != null;
                if (!res.next()) break;
                System.out.print(res.getString("Entity_name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int getDuree() {
        return duree;
    }
}
