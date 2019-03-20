package br.edu.ifpb.mapeamento.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class SampleDAO {
    
    private EntityManager em;

    public SampleDAO() {
        em = Persistence
                .createEntityManagerFactory("MapeamentoPU")
                .createEntityManager();
    }
    
    public void init() {
        em.getTransaction().begin();
        em.getTransaction().commit();
    }
    
}
