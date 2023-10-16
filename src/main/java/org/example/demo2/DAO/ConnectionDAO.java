package org.example.demo2.DAO;

import org.example.demo2.entities.Autor;
import org.example.demo2.entities.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ConnectionDAO {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("livraria");
    static EntityManager em = emf.createEntityManager();


    public static void connectionDAOautor(Autor autor){
        em.getTransaction();
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();

    }
    public static void connectionDAObook(Book book){
        em.getTransaction();
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();

    }
    public static Autor findAuthorBYId(Long Id){
        String jpql= "select a from Autor a where a.id = :autorid";
        TypedQuery<Autor> query = em.createQuery(jpql, Autor.class);
        query.setParameter("autorid", Id);
        List<Autor> result = query.getResultList();
        return result.get(0);
    }
    public static Book findBookById(Long id){
        return em.find(Book.class,id);

    }
}
