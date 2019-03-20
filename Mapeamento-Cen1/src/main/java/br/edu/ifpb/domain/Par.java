package br.edu.ifpb.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(ParPK.class)
public class Par implements Serializable {
    
    @Id
    @Column(name = "atorA", insertable = false, updatable = false)
    private int atorA_cod;
    @Id
    @Column(name = "atorB", insertable = false, updatable = false)
    private int atorB_cod;
    @Id
    @Column(name = "filme", insertable = false, updatable = false)
    private int filme_cod;
    
    @ManyToOne
    @JoinColumn(name = "atorA")
    private Ator atorA;
    @ManyToOne
    @JoinColumn(name = "atorB")
    private Ator atorB;
    @ManyToOne
    @JoinColumn(name = "filme")
    private Filme filme;

    public Par() {
    }

    public int getAtorA_cod() {
        return atorA_cod;
    }

    public void setAtorA_cod(int atorA_cod) {
        this.atorA_cod = atorA_cod;
    }

    public int getAtorB_cod() {
        return atorB_cod;
    }

    public void setAtorB_cod(int atorB_cod) {
        this.atorB_cod = atorB_cod;
    }

    public Ator getAtorA() {
        return atorA;
    }

    public void setAtorA(Ator atorA) {
        this.atorA = atorA;
    }

    public Ator getAtorB() {
        return atorB;
    }

    public void setAtorB(Ator atorB) {
        this.atorB = atorB;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public int getFilme_cod() {
        return filme_cod;
    }

    public void setFilme_cod(int filme_cod) {
        this.filme_cod = filme_cod;
    }
    
}
