package br.com.bibliotecaltv.teste.realizarLogin;

import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteRealizarLoginMonitor {
	public static void main(String[] args) throws Exception {
		MonitoresDAO dao = new MonitoresDAO();		
		Monitores monitor = dao.listarPorId(Monitores.class, 3L);
		boolean verifica = dao.realizarLoginUsuario("Monitores", monitor.getUsuario(), 
				monitor.getSenha());
		System.out.println(verifica);
	}
}
