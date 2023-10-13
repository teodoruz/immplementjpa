package org.example.demo2;


import org.example.demo2.DAO.ConnectionDAO;
import org.example.demo2.entities.Autor;
import org.example.demo2.entities.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("insert name of author");
        String nome = sc.nextLine();
        Autor a1 = new Autor();
        a1.setNome(nome);
        System.out.println("insert tittle");
        String titulo = sc.nextLine();
        Book b1 = new Book();
        b1.setTittle(titulo);
        b1.setAutor(a1);
        List<Book> books = new ArrayList();
        books.add(b1);
        a1.setBooks(books);
        ConnectionDAO.connectionDAO(a1, b1);

    }
}