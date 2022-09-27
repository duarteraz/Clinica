package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Especialidade {
	
	// Atributo
	private String nome;
	private String descricao;
	private static int quantidade;
	
	public Especialidade () {
	quantidade++;
	}
		
	
	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	// Métodos de acesso ( gatters and setters )
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void getQuantidade() {
		
	}


	public void setQuantidade() {
		 quantidade++;
	}



	}
	
	
	// criar 3 especialidades, guardar as especialidades em uma ArrayList<> 
	//e exibir o nome das especilidades 
	


