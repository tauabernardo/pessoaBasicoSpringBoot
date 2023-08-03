package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;


public class Programa {
    public static void main(String[] args) {
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpasimples");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 3);
        
        em.getTransaction().begin();;
        em.remove(p);
        em.getTransaction().commit();


        System.out.println("Pronto!");

        em.close();
        emf.close();


    }
}
