package br.edu.ifpb.main;

import br.edu.ifpb.dao.SampleDAO;
import br.edu.ifpb.domain.Carga;
import br.edu.ifpb.domain.Comandante;
import br.edu.ifpb.domain.Navio;
import br.edu.ifpb.domain.Produto;
import br.edu.ifpb.domain.Transporte;
import java.util.Date;

public class App {
    
    public static void main(String[] args) {
        
        SampleDAO dao = new SampleDAO();
        
        System.out.println("Salvando Comandante...");
        Comandante jack = new Comandante();
        jack.setNome("Jack Sparrow");
        dao.persist(jack);
        
        
        System.out.println("Salvando Navio...");
        Navio navio = new Navio();
        navio.setNome("Navio Pirata");
        navio.setComandante(jack);
        dao.persist(navio);
        
        System.out.println("Salvando Carga...");
        Carga carga = new Carga();
        carga.setOrigem("Cajazeiras");
        carga.setDestino("João Pessoa");
        dao.persist(carga);
        
        System.out.println("Salvando Produto...");
        Produto arroz = new Produto();
        arroz.setNome("arroz");
        dao.persist(arroz);
        
        System.out.println("Salvando Transporte...");
        Transporte t = new Transporte();
        t.setNavio(navio);
        t.setCarga(carga);
        t.setProduto(arroz);
        t.setDataT(new Date(23, 10, 2019));
        t.setValor(2500f);
        dao.persist(t);
    }
    
}