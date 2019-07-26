package br.com.johnmar.registradorpedidos.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double valor;
    @OneToOne
    private Cliente cliente;
    @OneToOne
    private Vendedor vendedor;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrada;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataLiberacaoSupervisor;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataLiberacaoDiretoria;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataSaida;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataLiberacaoSupervisor() {
        return dataLiberacaoSupervisor;
    }

    public void setDataLiberacaoSupervisor(Date dataLiberacaoSupervisor) {
        this.dataLiberacaoSupervisor = dataLiberacaoSupervisor;
    }

    public Date getDataLiberacaoDiretoria() {
        return dataLiberacaoDiretoria;
    }

    public void setDataLiberacaoDiretoria(Date dataLiberacaoDiretoria) {
        this.dataLiberacaoDiretoria = dataLiberacaoDiretoria;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
