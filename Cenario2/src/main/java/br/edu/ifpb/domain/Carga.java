package br.edu.ifpb.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
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

    public int getCodCarga() {
        return codCarga;
    }

    public void setCodCarga(int codCarga) {
        this.codCarga = codCarga;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

}
