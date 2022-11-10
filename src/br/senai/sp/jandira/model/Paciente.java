package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente extends Pessoa {

    public Paciente(Integer valueOf, String par, String par1) {
    }

    // Atributos
    private static int contador = 100;
    private Integer codigo;
    private PlanoDeSaude planoDeSaude;
    private String tipoSanguineo;

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

    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getPacienteSeparadoPorPontoEVirgula() {
        String PacienteStr = this.codigo + ";"
                + this.tipoSanguineo + ";"
                + this.planoDeSaude
                + this.getNome() + ";"
                + this.getTelefone() + ";"
                + this.getEmail();

        return PacienteStr;
    }

}
