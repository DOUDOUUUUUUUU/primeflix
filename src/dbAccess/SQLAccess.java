package dbAccess;

import java.sql.*;


public class SQLAccess { // WIP

    public static Connection connect(String port, String ip, String user, String pass) {
        try {
            Class.forName("");          // TODO: find this
            String url = "jdbc:mysql://" + ip + ":" + port + "/primeflix";
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected");
            return con;
        } catch (Exception ex) {
            System.out.println("Database.getConnection() Error --> " + ex.getMessage());
            return null;
        }
    }

    public static ResultSet dbQuery(Connection con, String QUERY) throws SQLException {
        try {
            Statement stmt = con.createStatement();
            return stmt.executeQuery(QUERY);
        }
        catch (Exception e) {
            System.out.println("dbQuery Error: " + e.getMessage());
            return null;
        }
    }
}
