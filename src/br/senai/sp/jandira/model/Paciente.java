package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente extends Pessoa {

    // Atributos
    private PlanoDeSaude planoDeSaude;
    private String tipoSanguineo;

    //Métodos
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
    


}
