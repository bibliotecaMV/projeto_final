package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.sessaoHibernate.HibernateUtil;

public class TesteCriacao {
	public static void main(String[] args) {
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();
	}
}
