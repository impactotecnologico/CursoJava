package net.impactotecnologico.demohibernate.service;

import java.util.List;

import net.impactotecnologico.demohibernate.dao.CategoriaDAO;
import net.impactotecnologico.demohibernate.pojo.Categoria;

public class Main {

	CategoriaDAO categoriaDao = new CategoriaDAO();

	public static void main(String[] args) {
		Main dbOperations = new Main();
		Categoria categoriaCreada = dbOperations.creaCategoria();

		List<Categoria> categoriaList = dbOperations.getCategoriaList();
		if (categoriaList != null) {
			for (Categoria student : categoriaList) {
				System.out.println("Nombre de la categoria : " + student.getNombre());
			}
		}
		dbOperations.updateCategoria(categoriaCreada.getId());
		Categoria categoriaActualizada = dbOperations.getCategoria(categoriaCreada.getId());
		if (categoriaActualizada != null) {
			System.out.println("Despues de Actualizar : " + categoriaActualizada.getNombre());
		}

		dbOperations.deleteCategoria(categoriaCreada.getId());

	}

	public Categoria creaCategoria() {
		Categoria s = new Categoria();
		s.setNombre("Panes");
		categoriaDao.addCategoria(s);
		return s;
	}

	public void updateCategoria(Integer id) {
		Categoria student = categoriaDao.findCategoriaById(id);
		student.setNombre("Pescados");
		categoriaDao.updateCategoria(student);
		System.out.println("Categoria Updated Success");
	}

	public void deleteCategoria(Integer id) {
		categoriaDao.deleteCategoria(id);
		System.out.println("Categoria Deleted Success");
	}

	public List<Categoria> getCategoriaList() {
		return categoriaDao.listCategoria();
	}

	public Categoria getCategoria(Integer id) {
		return categoriaDao.findCategoriaById(id);
	}

}
