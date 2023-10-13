package org.example.demo2.DAO;

import org.example.demo2.entities.Autor;
import org.example.demo2.entities.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionDAO {

    public static void connectionDAO(Autor autor, Book book){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("livraria");
        EntityManager em = emf.createEntityManager();

        em.getTransaction();
        em.getTransaction().begin();
        em.persist(autor);
        em.persist(book);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
