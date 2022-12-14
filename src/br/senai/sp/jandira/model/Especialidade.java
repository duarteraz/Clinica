package br.senai.sp.jandira.model;

public class Especialidade {

    private String nome;
    private String descricao;
    private Integer codigo;
    private static int contador = 100;

    // Métodos de acesso getters and setters
    // sempre será void.
    public Especialidade(String nome) {
        this.nome = nome;
        atualizarCodigo();
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        atualizarCodigo();
    }
    
    public Especialidade() {
        atualizarCodigo();
    }
    
    public Especialidade(Integer codigo, String nome, String descricao){
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.contador = this.codigo;
    }

    public static int getContador() {
        return contador;
    }

    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }
    
    public Integer getCodigo() {
        return codigo;
    }
    
    public void setNome(String nomeEspecialidade) {
        nome = nomeEspecialidade;
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
    
    public String dadosDaEspecialidade(){
       return this.nome + " , " + this.descricao;
    }

    
    
    public String getEspecialidadeSeparadoPorPontoEVirgula(){
            return this.codigo + ";" + this.nome + ";" + this.descricao; 
    }

}