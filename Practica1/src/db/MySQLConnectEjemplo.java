package db;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
 
public class MySQLConnectEjemplo {
    public static void main(String[] args) {

        Connection conn1 = null;
        try {
            String url1 = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7264745";
            String user = "sql7264745";
            String password = "Zb1XGdwrD6";
 
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database sql7264745");
            }
 
        } catch (SQLException ex) {
            System.out.println("Error en la conexion,usuario /password incorrecto");
            ex.printStackTrace();
        }
    }
}
