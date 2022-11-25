package br.senai.sp.jandira.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Especialidade {

    // Atributo
    private static int contador = 100;
    private Integer codigo;
    private String nome;
    private String descricao;

    // Construtor 
    public Especialidade() {
        contador++;
        this.codigo = contador;
    }

    public Especialidade(String nome) {
        this.nome = nome;
        this.codigo = contador;
        contador++;
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = contador;
        contador++;
    }

    public Especialidade(Integer codigo, String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.contador = this.codigo;
    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getNome() {

        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getEspecialidadePorPontoEVirgula() {
        String EspecialidadeStr = this.codigo + ";" + this.nome + ";" + this.descricao;
        return EspecialidadeStr;
    }

}

// criar 3 especialidades, guardar as especialidades em uma ArrayList<> 
//e exibir o nome das especilidades 
