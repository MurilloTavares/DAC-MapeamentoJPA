package br.edu.ifpb.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Conserto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private float valor;
    
    @Temporal(TemporalType.DATE)
    private Date realizadoEm;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "funcionario")
    private Funcionario funcionario;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "oficina")
    private Oficina oficina;

    public Conserto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getRealizadoEm() {
        return realizadoEm;
    }

    public void setRealizadoEm(Date realizadoEm) {
        this.realizadoEm = realizadoEm;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
    
}
