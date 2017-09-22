package br.com.bibliotecaltv.teste.excluir;


import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteExcluirMonitor {

	public static void main(String[] args) {
		AdministradorDAO dao  = new AdministradorDAO();
		Long id = dao.buscarIdMonitores("renato", "123");
		Monitores monitores = dao.buscarMonitorPorId(id);
		dao.excluirMonitores(monitores);
		System.out.println("Exclui você!!!");
	}

}
