package net.impactotecnologico.demohibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.impactotecnologico.demohibernate.config.HibernateConnector;
import net.impactotecnologico.demohibernate.pojo.Categoria;

public class CategoriaDAO {

	public List<Categoria> listCategoria() {
		Session session = null;
		try {
			session = HibernateConnector.getInstance().getSession();
			Query query = session.createQuery("from Categoria s");

			List queryList = query.list();
			if (queryList != null && queryList.isEmpty()) {
				return null;
			} else {
				System.out.println("list " + queryList);
				return queryList;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

	public Categoria findCategoriaById(int id) {
		Session session = null;
		try {
			session = HibernateConnector.getInstance().getSession();
			Query query = session.createQuery("from Categoria s where s.id = :id");
			query.setParameter("id", id);

			List queryList = query.list();
			if (queryList != null && queryList.isEmpty()) {
				return null;
			} else {
				return (Categoria) queryList.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

	public void updateCategoria(Categoria student) {
		Session session = null;
		try {
			session = HibernateConnector.getInstance().getSession();
			session.saveOrUpdate(student);
			session.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public Categoria addCategoria(Categoria student) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateConnector.getInstance().getSession();
			System.out.println("session : " + session);
			transaction = session.beginTransaction();
			session.save(student);
			transaction.commit();
			return student;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void deleteCategoria(int id) {
		Session session = null;
		try {
			session = HibernateConnector.getInstance().getSession();
			Transaction beginTransaction = session.beginTransaction();
			Query createQuery = session.createQuery("delete from Categoria s where s.id =:id");
			createQuery.setParameter("id", id);
			createQuery.executeUpdate();
			beginTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
