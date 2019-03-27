package br.edu.ifpb.domain;

import java.io.Serializable;

public class NotaPK implements Serializable {

    private int filme_cod;
    private int evento_cod;

    public NotaPK() {
    }

    public NotaPK(int filme, int evento) {
        this.filme_cod = filme;
        this.evento_cod = evento;
    }

    public int getFilmeCod() {
        return filme_cod;
    }

    public void setFilmeCod(int filme) {
        this.filme_cod = filme;
    }

    public int getEventoCod() {
        return evento_cod;
    }

    public void setEventoCod(int evento) {
        this.evento_cod = evento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.filme_cod;
        hash = 89 * hash + this.evento_cod;
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
        final NotaPK other = (NotaPK) obj;
        if (this.filme_cod != other.filme_cod) {
            return false;
        }
        if (this.evento_cod != other.evento_cod) {
            return false;
        }
        return true;
    }

}
