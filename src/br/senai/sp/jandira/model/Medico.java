package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico extends Pessoa {

    private static int contador = 100;
    private Integer codigo;
    private String crm;
    private ArrayList<Especialidade> especialidades;
    
      public ArrayList<Especialidade> getEspecialidade() {
          return especialidades;  
    }

    public Medico() {

        atualizarCodigo();

    }

    public Medico(Integer codigo, String crm, String nome) {

        this.codigo = codigo;
        setNome(nome);
        this.crm = crm;

    }

    public Medico(String crm, String nome) {
        this.crm = crm;
        atualizarCodigo();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

//
    

    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        String MedicosStr
                = this.codigo + ";"
                + getNome() + ";"
                + getCrm() + ";"
                + getTelefone();
        return MedicosStr;

    }
}
