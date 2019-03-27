package br.edu.ifpb.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Transporte implements Serializable{
    
    @EmbeddedId
    private TransportePK pk;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "carga")
    private Carga carga;
    
    @OneToOne
    @JoinColumn(name = "navio")
    private Navio navio;
    
    @ManyToOne
    @JoinColumn(name = "produto")
    private Produto produto;
    
    @Temporal(TemporalType.DATE)
    private Date dataT;
    private float valor;

    public TransportePK getPk() {
        return pk;
    }

    public void setPk(TransportePK pk) {
        this.pk = pk;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

    public Navio getNavio() {
        return navio;
    }

    public void setNavio(Navio navio) {
        this.navio = navio;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Date getDataT() {
        return dataT;
    }

    public void setDataT(Date dataT) {
        this.dataT = dataT;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
