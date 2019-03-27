package br.edu.ifpb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
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

    public int getIdComandante() {
        return idComandante;
    }

    public void setIdComandante(int idComandante) {
        this.idComandante = idComandante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Navio> getNavios() {
        return navios;
    }

    public void setNavios(List<Navio> navios) {
        this.navios = navios;
    }
    
}
