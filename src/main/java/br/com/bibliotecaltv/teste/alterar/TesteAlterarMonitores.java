package br.com.bibliotecaltv.teste.alterar;

import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteAlterarMonitores {

	public static void main(String[] args) throws Exception {
		MonitoresDAO dao = new MonitoresDAO();
		Monitores monitores = dao.listarPorId(Monitores.class, 2L);
		monitores.setUsuario("renatorichard2012@gmail.com");
		monitores.setSenha("123456");
		dao.alterar(monitores);
	}

}
