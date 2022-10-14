package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {

    //atributos
    private Paciente paciente;
    private Especialidade especialidade;
    private Médico médico;
    private LocalDate dataDaConsulta;
    private LocalTime horarioDaConsulta;
    private String observacao;
    private boolean compareceu;

    // métodos 
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Médico getMédico() {
        return médico;
    }

    public void setMédico(Médico médico) {
        this.médico = médico;
    }

    public LocalDate getDataDaConsulta() {
        return dataDaConsulta;
    }

    public void setDataDaConsulta(LocalDate dataDaConsulta) {
        this.dataDaConsulta = dataDaConsulta;
    }

    public LocalTime getHorarioDaConsulta() {
        return horarioDaConsulta;
    }

    public void setHorarioDaConsulta(LocalTime horarioDaConsulta) {
        this.horarioDaConsulta = horarioDaConsulta;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public boolean isCompareceu() {
        return compareceu;
    }

    public void setCompareceu(boolean compareceu) {
        this.compareceu = compareceu;
    }

}
