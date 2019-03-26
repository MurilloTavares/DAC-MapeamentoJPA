package br.edu.ifpb.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TransportePK implements Serializable {
    
    @Column(name = "navio", insertable = false, updatable = false)
    private int navio;
    
    @Column(name = "carga", insertable = false, updatable = false)
    private int carga;
    
    @Column(name = "produto", insertable = false, updatable = false)
    private int produto;

    public TransportePK() {
    }

    public TransportePK(int navio, int carga, int produto) {
        this.navio = navio;
        this.carga = carga;
        this.produto = produto;
    }

    public int getNavio() {
        return navio;
    }

    public void setNavio(int navio) {
        this.navio = navio;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.navio;
        hash = 97 * hash + this.carga;
        hash = 97 * hash + this.produto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TransportePK other = (TransportePK) obj;
        if (this.navio != other.navio) {
            return false;
        }
        if (this.carga != other.carga) {
            return false;
        }
        if (this.produto != other.produto) {
            return false;
        }
        return true;
    }
    
}
