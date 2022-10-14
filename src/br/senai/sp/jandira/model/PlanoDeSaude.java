package br.senai.sp.jandira.model;

public class PlanoDeSaude {

    // Atributos
    private static int contador = 100;
    private Integer codigo;
    private String operadora;
    private String tipoDoPlano;

    //Construtor
    public PlanoDeSaude(String operadora) {
        this.operadora = operadora;
        atualizarCodigo();
    }

    public PlanoDeSaude(String operadora, String tipoDoPlano) {
        this.operadora = operadora;
        this.tipoDoPlano = tipoDoPlano;
        atualizarCodigo();
    }

    public PlanoDeSaude() {
        atualizarCodigo();
    }

    public String getDadosDoPlano() {
        return this.operadora + ", "
                + this.tipoDoPlano;
    }

    private void atualizarCodigo() {
        this.codigo = contador;
        contador++;
    }

    // Métodos de acesso
    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getTipoDoPlano() {
        return tipoDoPlano;
    }

    public void setTipoDoPlano(String tipoDoPlano) {
        this.tipoDoPlano = tipoDoPlano;
    }

    public static int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

}
