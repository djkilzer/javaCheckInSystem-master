package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectDB {

    //ConnectDB is used to connect to a MySQL DB Server

    public Connection Connect() {
        try {

            //"jdbc:mysql://mysql.benjaminsalazar.com:3306/peterdb284","czubkuk","jCT3qRR^");

            String url = "jdbc:mysql://mysql.benjaminsalazar.com:3306/peterdb284";
            String user = "czubkuk";
            String password = "jCT3qRR^";

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}
