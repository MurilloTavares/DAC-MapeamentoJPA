package br.edu.ifpb.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Navio implements Serializable {
    
    @Id
    @GeneratedValue
    private int codNavio;
    private String nome;
    private int capacidade;
    private String pais;
    
    @ManyToOne
    @JoinColumn(name = "comandante")
    private Comandante comandante;
    
    @OneToOne(mappedBy = "navio")
    private Transporte transporte;
    
}
