package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Especialidade {

    // Atributo
    private static int contador = 100;
    private Integer codigo;
    private String nome;
    private String descricao;

    // Construtor 
    private void atualizarCodigo() {
        this.codigo = contador;
        contador++;
    }

    public Especialidade() {
        atualizarCodigo();

    }

    public Especialidade(String nome) {
        this.nome = nome;
        atualizarCodigo();
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        atualizarCodigo();
    }

    public String getDadosEspecialidade() {
        return this.nome + ", "
                + this.descricao;
    }

    // Métodos 
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

    public static int getContador() {

        return contador;
    }
        public Integer getCodigo() {
        return codigo;
    }

 
    

}






// criar 3 especialidades, guardar as especialidades em uma ArrayList<> 
//e exibir o nome das especilidades 

