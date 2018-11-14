package es.indra.categorias.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.indra.categorias.beans.Categoria;
import es.indra.categorias.dao.CategoriasDao;


@WebServlet("/CategoriaServlet")
public class CategoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	CategoriasDao categoriasDao = new CategoriasDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String nombre =  request.getParameter("nombre");
		
		Categoria cat = new Categoria(id,nombre);
		
		categoriasDao.createCategory(cat);
		
		List<Categoria> todas =  categoriasDao.getAllCategories();
		
		request.setAttribute("listadoGeneral", todas);
		
		request.getRequestDispatcher("listadoGeneral.jsp").forward(request, response);

	}

}

















