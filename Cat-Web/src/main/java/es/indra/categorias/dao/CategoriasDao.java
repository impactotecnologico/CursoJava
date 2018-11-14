package es.indra.categorias.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.indra.categorias.beans.Categoria;

public class CategoriasDao {

	DataBaseManager dbm;

	public CategoriasDao() {
		this.dbm = new DataBaseManager();
	}

	public void createCategory(Categoria c) {
		Connection conn = this.dbm.crearConexion();

		String query = " insert into categorias values (?, ?)";

		try {
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setInt(1, c.getId());
			preparedStmt.setString(2, c.getNombre());

			preparedStmt.execute();

			this.dbm.cerrarConexion(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Categoria> getAllCategories() {
		List<Categoria> listado = new ArrayList<>();

		Connection conn = this.dbm.crearConexion();

		String query = "SELECT * FROM categorias";

		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				listado.add(new Categoria(rs.getInt("id"), rs.getString("nombre")));
			}
			st.close();
			
			this.dbm.cerrarConexion(conn);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listado;
	}

}
