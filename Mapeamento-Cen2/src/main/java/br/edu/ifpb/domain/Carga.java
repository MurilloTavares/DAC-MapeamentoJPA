package br.edu.ifpb.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Carga implements Serializable {
    
    @Id
    @GeneratedValue
    private int codCarga;
    private String origem;
    private String destino;
    
    @OneToOne(mappedBy = "carga")
    private Transporte transporte;
    
}
