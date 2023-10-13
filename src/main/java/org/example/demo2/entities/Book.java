package org.example.demo2.entities;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_book;
    private String Tittle;
    @ManyToOne
    private Autor autor;

    public Book() {

    }

    public String getTittle() {
        return Tittle;
    }

    public Book(String tittle) {
        Tittle = tittle;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;

    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
