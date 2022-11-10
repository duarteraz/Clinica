package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataDeNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String Telefone) {
        this.telefone = Telefone;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

//    public String getPessoaSeparadoPorPontoEVirgula() {
//        String PessoaStr = this.nome + ";" + this.email + ";" + this.telefone + ";" + this.dataDeNascimento;
//        return PessoaStr;
//}
    
}
