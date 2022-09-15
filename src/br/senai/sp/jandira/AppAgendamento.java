package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.Paciente;

public class AppAgendamento {

	public static void main(String[] args) {

		// Especialidade
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");

		System.out.println(especialidade.getNome());

		// Plano de Saúde
		PlanoDeSaude plano = new PlanoDeSaude();
		plano.setOperadora("Unimed");
		plano.setTipoDoPlano("bronze");
	
		//JOptionPane.showMessageDialog(null, plano.getDadosDoPlano());
	
		
		PlanoDeSaude planoBradesco = new PlanoDeSaude();
		planoBradesco.setOperadora("Bradesco");
		planoBradesco.setTipoDoPlano("Ouro");
		
		System.out.println(planoBradesco.getDadosDoPlano());
		
		//JOptionPane.showMessageDialog(null, planoBradesco.getDadosDoPlano());
		
		System.out.println(planoBradesco.getDadosDoPlano());
		
		// Paciente 
		Paciente paciente = new Paciente();
		paciente.setNome("Pedro");
		paciente.setEmail("pedro@uol.br");
		paciente.setPlanoDeSaude(paciente.getPlanoDeSaude().getOperadora());
		

	}

}
