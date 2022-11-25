package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico extends Pessoa {

    public Medico(Integer valueOf, String par, String par1) {
    }

    //Atributos
    private static int contador = 100;
    private Integer codigo;
    private String crm;
    private static ArrayList<Medico> medicos;
    private Especialidade especialidade;

    public Medico() {
    }

    public Medico(Integer valueOf, String string, String string0, String string1, String string2, LocalDate dataDeNascimento, ArrayList<Especialidade> especialidade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//Métodos
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

    public static ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public static void setMedicos(ArrayList<Medico> medicos) {
        Medico.medicos = medicos;
    }

    public String getCrm() {
        return crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public String getMedicoComPontoVirgula() {
        return this.getCodigo()
                + ";" + this.getCrm()
                + ";" + this.getNome()
                + ";" + this.getTelefone()
                + ";" + this.getEmail()
                + ";" + this.getDataNascimento();
    }

    public static void setContador(int contador) {
        Medico.contador = contador;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

}
