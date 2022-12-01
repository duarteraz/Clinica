package br.senai.sp.jandira.model;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Medico extends Pessoa {

	private static int contador = 100;
	private String crm;
	private ArrayList<Especialidade> especialidades;
	private Integer codigo;

	public ArrayList<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public String getEspecialidadesStr() {
		return especialidades.toString();
	}

	public void setEspecialidades(ArrayList<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}

	public Medico() {
		atualizarCodigo();
	}

	public Medico(String nome, String telefone) {
		getNome();
		getTelefone();
		atualizarCodigo();
	}

	public Medico(Integer codigo, String nome, String crm, String telefone, String email, String dataNascimento,
			ArrayList<Especialidade> especialidades) {

		this.codigo = codigo;
		super.setNome(nome);
		this.crm = crm;
		super.setTelefone(telefone);
		super.setEmail(email);
		super.setDataNascimento(dataNascimento);
		this.especialidades = especialidades;
		this.contador = codigo;
	}

	public void setEspecialidade(ArrayList<Especialidade> especialidade) {
		this.especialidades = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public static int getContador() {
		return contador;
	}

	private void atualizarCodigo() {
		contador++;
		this.codigo = contador;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getMedicoSeparadoPorPontoEVirgula() {

		String getCodigoEspecialidades = "";
		for (Especialidade e : especialidades) {
			getCodigoEspecialidades += e.getCodigo() + ";";
		}
		return this.codigo + ";" + this.getNome() + ";" + this.crm + ";" + 
		super.getTelefone() + ";" + super.getEmail()+ ";" + 
		super.getDataNascimento() + ";" + getCodigoEspecialidades;
	}

	public ArrayList<String> getListaDeEspecialidadesDoMedico() {
		ArrayList<String> dados = new ArrayList<>();
		for (Especialidade e : especialidades) {
			dados.add(e.getNome());
		}
		DefaultListModel<String> ListaModel = new DefaultListModel<>();

		ListaModel.addAll(dados);

		return dados;

	}

}
