package testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;

public class TesteDaoXpto {

	public static void main(String[] args) {
		
		TesteDao.main(args);
		
		//PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
		System.out.println(PlanoDeSaudeDAO.listarTodos().size());

	}

}