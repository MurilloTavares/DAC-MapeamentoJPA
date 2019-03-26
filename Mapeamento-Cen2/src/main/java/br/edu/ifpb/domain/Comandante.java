package br.edu.ifpb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Comandante implements Serializable{
    
    @Id
    @GeneratedValue
    private int idComandante;
    private String nome;
    private String pais;
    
    @OneToMany(mappedBy = "comandante")
    private List<Navio> navios;
    
}
