package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
    private static String url = "jdbc:mysql://..";
    private static String connectionDriver = "com.mysql.jdbc...";
    private static Connection con = null;


    public static Connection getConnection() {
        if(con == null)
        getInstance();
        return con;
    }

    private static Connection getInstance() {
        try {
            Class.forName(connectionDriver);
            con = DriverManager.getConnection(url);
            return con;
        } catch (ClassNotFoundException ce) {
            System.out.println(ce.getException());
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return null;
    }
}
