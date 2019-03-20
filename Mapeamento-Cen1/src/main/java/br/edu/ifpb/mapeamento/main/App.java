package br.edu.ifpb.mapeamento.main;

import br.edu.ifpb.mapeamento.dao.SampleDAO;

public class App {
    
    public static void main(String[] args) {
        
        SampleDAO dao = new SampleDAO();
        dao.init();
        System.out.println("ASDASDED");
        
    }
    
}
