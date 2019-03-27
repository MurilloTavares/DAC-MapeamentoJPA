package br.edu.ifpb.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class SampleDAO {
    
    private EntityManager em;

    public SampleDAO() {
        em = Persistence
                .createEntityManagerFactory("MapeamentoPU")
                .createEntityManager();
    }
    
    public void persist(Object t) {
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }
    
}