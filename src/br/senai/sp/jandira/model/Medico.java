package br.senai.sp.jandira.model;

import java.util.ArrayList; 

public class Medico extends Pessoa {

    // Atributos 
    private ArrayList<Especialidade> especialidades;
    private String crm;
        private static int contador = 100;
    private Integer codigo;

    // Métodos
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
 
      public String getMedicoSeparadoPorPontoEVirgula() {
        String planoDeSaudeStr = this.codigo + ";" + this.crm + ";" + this.especialidades;
        return planoDeSaudeStr;
    }
    

}
