package br.edu.ifpb.domain;

import java.io.Serializable;

public class ParPK implements Serializable{
    
    private int atorA_cod;
    private int atorB_cod;
    private int filme_cod;

    public ParPK() {
    }

    public ParPK(int atorA_cod, int atorB_cod, int filme_cod) {
        this.atorA_cod = atorA_cod;
        this.atorB_cod = atorB_cod;
        this.filme_cod = filme_cod;
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

    public int getFilme_cod() {
        return filme_cod;
    }

    public void setFilme_cod(int filme_cod) {
        this.filme_cod = filme_cod;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.atorA_cod;
        hash = 71 * hash + this.atorB_cod;
        hash = 71 * hash + this.filme_cod;
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
        final ParPK other = (ParPK) obj;
        if (this.atorA_cod != other.atorA_cod) {
            return false;
        }
        if (this.atorB_cod != other.atorB_cod) {
            return false;
        }
        if (this.filme_cod != other.filme_cod) {
            return false;
        }
        return true;
    }
    
}
