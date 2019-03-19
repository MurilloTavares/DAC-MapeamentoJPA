package br.edu.ifpb.dao;

import br.edu.ifpb.domain.Conserto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConsertoDAO {
    
    EntityManagerFactory emf;
    EntityManager em;
    
    public ConsertoDAO(){
        emf = Persistence.createEntityManagerFactory("MapeamentoPU");
        em = emf.createEntityManager();
    }
    
    public void salvar(Conserto c){
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }
    
    public void remover(Conserto c){
        em.getTransaction().begin();
        c = em.find(Conserto.class, c.getId());
        em.remove(c);
        em.getTransaction().commit();
    }
    
}
