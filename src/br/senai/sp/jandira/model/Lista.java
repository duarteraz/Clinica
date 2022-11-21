package br.senai.sp.jandira.model;

public class Lista extends Especialidade {

    private static int contador = 100;
    private Integer codigo;

    public Lista() {
        atualizarCodigo();
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
}
