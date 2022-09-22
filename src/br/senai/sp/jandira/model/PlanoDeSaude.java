package br.senai.sp.jandira.model;

public class PlanoDeSaude {
	
	// Atributos
	private String operadora;
	private String tipoDoPlano;
	
	//Construtor
	public  PlanoDeSaude (String operadora) {
		this.operadora = operadora;
	}
	
	public PlanoDeSaude (String operadora, String tipoDoPlano) {
		this.operadora = operadora;
		this.tipoDoPlano = tipoDoPlano;
	}
	
	public PlanoDeSaude() {
		
	}
	
	  public String getDadosDoPlano() { return this.operadora + ", " +
	  this.tipoDoPlano; }

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getTipoDoPlano() {
		return tipoDoPlano;
	}

	public void setTipoDoPlano(String tipoDoPlano) {
		this.tipoDoPlano = tipoDoPlano;
	}
	  
	 
	
}
