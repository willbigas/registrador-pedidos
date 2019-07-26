package br.com.johnmar.registradorpedidos.model.enums;

public enum Supervisor {

    PALUDO(1, "SIDNEI PALUDO"),
    JULIO(2, "JULIO MAX BERNARDO DE OLIVEIRA"),
    FLANDER(3, "FLANDER JOSE DE JESUS"),
    ALEXANDRA(4, "ALEXANDRA APARECIDA DE AMORIM");

    private Integer codigo;
    private String nomeCompleto;

    Supervisor(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nomeCompleto = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
}
