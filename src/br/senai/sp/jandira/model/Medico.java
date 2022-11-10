package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Medico extends Pessoa {

    public Medico(Integer valueOf, String par, String par1) {
    }

    // Atributos 
    private static int contador = 100;
    private Integer codigo;
    private ArrayList<Especialidade> especialidades;
    private String crm;

    public Medico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Métodos
    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }

    public static int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        String MedicoStr = this.codigo + ";"
                + this.crm + ";"
                + this.especialidades + ";"
                + this.getNome() + ";"
                + this.getTelefone() + ";"
                + this.getEmail();

        return MedicoStr;
    }

}
