package br.edu.ifpb.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(NotaPK.class)
public class Nota implements Serializable {
    
    @Id
    @Column(name = "filme", insertable = false, updatable = false)
    private int filme_cod;
    
    @Id
    @Column(name = "evento", insertable = false, updatable = false)
    private int evento_cod;
    
    @ManyToOne
    @JoinColumn(name = "filme")
    private Filme filme;
    
    @JoinColumn(name = "evento")
    @ManyToOne
    private Evento evento;
    
    private int nota;

    public Nota() {
    }

    public int getFilme_cod() {
        return filme_cod;
    }

    public void setFilme_cod(int filme_cod) {
        this.filme_cod = filme_cod;
    }

    public int getEvento_cod() {
        return evento_cod;
    }

    public void setEvento_cod(int evento_cod) {
        this.evento_cod = evento_cod;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
}
