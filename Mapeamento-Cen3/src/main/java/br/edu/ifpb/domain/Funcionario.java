package br.edu.ifpb.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String cpf;
    private String rg;
    private float salario;
    private String cargo;

    public Funcionario() {
    }

    public Funcionario(String cpf, String rg, float salario, String cargo) {
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
        this.cargo = cargo;
    }
    
}
