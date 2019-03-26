package br.edu.ifpb.domain;

import java.io.Serializable;
import java.util.Date;
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
    
    @OneToOne
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
    
}
