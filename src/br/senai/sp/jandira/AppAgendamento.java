package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereço;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Genero;
import br.senai.sp.jandira.model.Médico;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.Paciente;

public class AppAgendamento {

	public static void main(String[] args) {

		// Plano de Saúde
		PlanoDeSaude plano = new PlanoDeSaude();
		plano.setOperadora("Unimed");
		plano.setTipoDoPlano("Prata");
		
		//Criando o objeto ja passando o nome da operadora

		// Endereço
		Endereço endereço = new Endereço();
		endereço.setLogradouro(" Elton Silva ");
		endereço.setNumero("905");
		endereço.setCidade("Jandira");
		endereço.setBairro("Centro");
		endereço.setEstado("SP");
		endereço.setTipo("");
		endereço.setComplemento("Instituição de Ensino");
		endereço.setPontoDeReferencia("Em frente a prefeitura");
		endereço.setCep("06600-025");

		// Paciente
		Paciente paciente = new Paciente();
		paciente.setNome("Patricia");
		paciente.setEmail("pat@uol.com.br");
		paciente.setCpf("123.456.789-00");
		paciente.setRg("123.456-99");
		paciente.setTelefone("(11)99999-9999");
		paciente.setTipoSanguineo("O+");
		paciente.setGenero(Genero.FEMININO);
		paciente.setEstados(Estados.SÃO_PAULO);
		paciente.setPlanoDeSaude(plano);

		// Especialidade
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");

		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");

		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Clínico Geral");

		// Médico
		Médico médico1 = new Médico();
		médico1.setNome("Marcos");
		médico1.setDataDeNascimento(LocalDate.of(1990, 6, 8));
		médico1.setCrm("4562-9");
		médico1.setGenero(Genero.MASCULINO);

		// Criar a lista de especialidades
		Especialidade[] especialidadesMedico1 = { especialidade1, especialidade3 };
		médico1.setEspecialidades(especialidadesMedico1);

		Médico médico2 = new Médico();
		médico2.setNome("Fabiana");
		médico2.setDataDeNascimento(LocalDate.of(1984, 11, 27));
		médico2.setCrm("3214-2");
		médico2.setGenero(Genero.FEMININO);

		// Lista de especialidade
		Especialidade[] especialidadesMedico2 = { especialidade2 };
		médico2.setEspecialidades(especialidadesMedico2);

		// Agenda
//		A Paciente Patrícia ligou na clinica para agendar uma consulta
//		com um clinico geral para 22/09/2022 ÁS 14H20
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente);
		agenda1.setEspecialidade(especialidade3);
		agenda1.setMédico(médico1);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 22));
		agenda1.setHorarioDaConsulta(LocalTime.of(14, 20));
		agenda1.setObservacao("Nada a observar. ");
		agenda1.setCompareceu(false);

//		 Imprimir dados
//		 Nome do paciente,
//		nome do medico,
//		qual a especialidade, 
//		dia e hora da consulta

		System.out.println("Nome do Paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Nome do Médico: " + agenda1.getMédico().getNome());
		System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
		System.out.println("Dia e Hora: " + agenda1.getDataDaConsulta() + " ás " + agenda1.getHorarioDaConsulta());
		System.out.println("Plano de Saúde: " + agenda1.getPaciente().getPlanoDeSaude().getDadosDoPlano());

	}

}
