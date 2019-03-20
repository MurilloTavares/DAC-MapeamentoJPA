package br.edu.ifpb.main;

import br.edu.ifpb.dao.SampleDAO;

public class App {
    
    public static void main(String[] args) {
        
        SampleDAO dao = new SampleDAO();
        dao.init();
        System.out.println("ASDASDED");
        
    }
    
}
