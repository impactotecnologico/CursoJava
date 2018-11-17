package net.impactotecnologico.demohibernate.service;

import java.util.List;

import net.impactotecnologico.demohibernate.dao.CategoriaDAO;
import net.impactotecnologico.demohibernate.pojo.Categoria;

public class Main {

	CategoriaDAO categoriaDao = new CategoriaDAO();

	public static void main(String[] args) {
		Main mainObj = new Main();
		Categoria categoriaCreada = mainObj.creaCategoria();

		List<Categoria> categoriaList = mainObj.getCategoriaList();
		if (categoriaList != null) {
			for (Categoria cat : categoriaList) {
				System.out.println("Nombre de la categoria : " + cat.getNombre());
			}
		}
		mainObj.updateCategoria(categoriaCreada.getId());
		Categoria categoriaActualizada = mainObj.getCategoria(categoriaCreada.getId());
		if (categoriaActualizada != null) {
			System.out.println("Despues de Actualizar : " + categoriaActualizada.getNombre());
		}

		mainObj.deleteCategoria(categoriaCreada.getId());

	}

	public Categoria creaCategoria() {
		Categoria s = new Categoria();
		s.setId(199);
		s.setNombre("Panes");
		categoriaDao.addCategoria(s);
		return s;
	}

	public void updateCategoria(Integer id) {
		Categoria cat = categoriaDao.findCategoriaById(id);
		cat.setNombre("Pescados");
		categoriaDao.updateCategoria(cat);
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
