package br.senai.sp.jandira.model;

public class Paciente {
	
	// Atributos
	private String nome, email;
	private PlanoDeSaude planoDeSaude;
	
	//Métodos de acessp (set e get)
	public void setNome(String nome) {
		this.nome = nome;
	} 
	public String getNome() {
		return nome;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	
	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}
	public PlanoDeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}
	
//	public String getDadosPaciente() {
//		return "Paciente:" +  this.nome + ", " + this.email + "," + this.planoDeSaude
//	}
	
	

	
}
