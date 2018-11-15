/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.impactotecnologico.demohibernate.config;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import net.impactotecnologico.demohibernate.pojo.Categoria;

public class HibernateConnector {

	private static HibernateConnector me;
	private Configuration cfg;
	private SessionFactory sessionFactory;

	private HibernateConnector() throws HibernateException {

		cfg = new Configuration().configure();
		cfg.addAnnotatedClass(Categoria.class);

		sessionFactory = cfg.buildSessionFactory();
	}

	public static synchronized HibernateConnector getInstance() throws HibernateException {
		if (me == null) {
			me = new HibernateConnector();
		}

		return me;
	}

	public Session getSession() throws HibernateException {
		Session session = sessionFactory.openSession();
		if (!session.isConnected()) {
			this.reconnect();
		}
		return session;
	}

	private void reconnect() throws HibernateException {
		this.sessionFactory = cfg.buildSessionFactory();
	}
}
