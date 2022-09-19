package br.senai.sp.jandira.model;

public class PlanoDeSaude {
	
	// Atributos
	private String operadora;
	private String tipoDoPlano;

	// Métodos de acesso ( set e get )
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public String getOperadora() {
		return this.operadora;
	}
	
	
	public void setTipoDoPlano(String tipoDoPlano) {
		this.tipoDoPlano = tipoDoPlano;
	}
	public String getTipoDoPlano() {
		return this.tipoDoPlano;
	}
	
	
	
	  public String getDadosDoPlano() { return this.operadora + ", " +
	  this.tipoDoPlano; }
	 
	
}
