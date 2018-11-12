package db;
 import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class MySQLInsertEjemplo {
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
            
            String query = " insert into categorias values (?, ?)";
            PreparedStatement preparedStmt = conn1.prepareStatement(query);
            preparedStmt.setInt (1, 10);
            preparedStmt.setString (2, "Alimentacion");
            
            preparedStmt.execute();
            
            
            //********************************************************
            
            query = "SELECT * FROM categorias";

            Statement st = conn1.createStatement();
            
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next())
            {
              int id = rs.getInt("id");
              String nombre = rs.getString("nombre");
             
              System.out.format("%s, %s \n", id, nombre);
            }
            st.close();
            
            
            
            conn1.close();
 
        } catch (SQLException ex) {
            System.out.println("Error en la conexion,usuario /password incorrecto");
            ex.printStackTrace();
        }
    }
}
