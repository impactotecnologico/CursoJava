package es.indra.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
            
            String query = " insert into categorias values (?, ?)";
            PreparedStatement preparedStmt = conn1.prepareStatement(query);
            preparedStmt.setInt (1, 190);
            preparedStmt.setString (2, "Alimentaciones");
            
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
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



















