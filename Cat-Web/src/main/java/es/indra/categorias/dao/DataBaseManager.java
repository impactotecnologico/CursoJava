package es.indra.categorias.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManager {
	
	public Connection crearConexion() {
		Connection conn1 = null;
        try {
            String url1 = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7264745";
            String user = "sql7264745";
            String password = "Zb1XGdwrD6";
 
            Class.forName("com.mysql.jdbc.Driver");
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database sql7264745");
            }
            
        }catch (SQLException e) {
        	e.printStackTrace();
        } catch (ClassNotFoundException e) {
		}
        
        return conn1;
	}
	
	public void cerrarConexion(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
