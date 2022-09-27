package testes;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteDao {

	public static void main(String[] args) {
		
		PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
		PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
		PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
		PlanoDeSaude plano4 = new PlanoDeSaude("NotreDame", "Advance");

		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
		dao.gravar(plano1);
		dao.gravar(plano2);
		
		for (PlanoDeSaude planos : dao.listarTodos()) {
			System.out.println(planos.getOperadora());
		}
		
		
		System.out.println("---------------------------");
		PlanoDeSaudeDAO dao2 = new PlanoDeSaudeDAO();
		dao.gravar(plano3);
		dao.gravar(plano4);
		
		for (PlanoDeSaude planos : dao.listarTodos()) {
			System.out.println(planos.getOperadora());
		}
	}

}
 