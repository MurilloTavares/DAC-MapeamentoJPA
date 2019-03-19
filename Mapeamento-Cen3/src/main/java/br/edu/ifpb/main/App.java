package br.edu.ifpb.main;

import br.edu.ifpb.dao.ConsertoDAO;
import br.edu.ifpb.domain.Conserto;
import br.edu.ifpb.domain.Funcionario;
import br.edu.ifpb.domain.Localizacao;
import br.edu.ifpb.domain.Oficina;
import java.util.Date;

public class App {

    public static void main(String[] args) {

        ConsertoDAO dao = new ConsertoDAO();
                
        Funcionario joao = new Funcionario(
                "111.111.111-11",
                "12.345.678-9",
                1500f,
                "empregado");
        
        
        Oficina oficina = new Oficina(
                new Localizacao("Rua A", "Bairro A", "Cidade A"),
                5000f);
        oficina.getFuncionarios().add(joao);
        
        Conserto conserto = new Conserto();
        conserto.setFuncionario(joao);
        conserto.setRealizadoEm(new Date());
        conserto.setValor(100f);
        
        conserto.setOficina(oficina);
        dao.salvar(conserto);
        
    }

}
