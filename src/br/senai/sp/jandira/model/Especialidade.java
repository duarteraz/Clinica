package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Especialidade {

    // Atributo
    private static int contador = 100;
    private Integer codigo;
    private String nome;
    private String descricao;

    // Construtor 
     public Especialidade (Integer codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.contador = this.codigo;
    }
    
    
    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
       
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
        
           public String getEspecialidadePorPontoEVirgula () {
        String EspecialidadeStr = this .codigo + ";" + this.nome + ";" + this.descricao;
        return EspecialidadeStr;
    }

 
    

}






// criar 3 especialidades, guardar as especialidades em uma ArrayList<> 
//e exibir o nome das especilidades 

