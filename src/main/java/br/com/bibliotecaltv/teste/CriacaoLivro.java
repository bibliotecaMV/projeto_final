package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.sessaoHibernate.HibernateUtil;

public class CriacaoLivro {
	public static void main(String[] args){
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();
		System.out.println("Deu certo!");
	}
}
