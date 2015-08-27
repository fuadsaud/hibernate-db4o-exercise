package br.unisinos.cc.bd2.ga1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GA1");
        EntityManager em = emf.createEntityManager();
    }
}
