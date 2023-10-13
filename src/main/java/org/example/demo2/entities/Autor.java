package org.example.demo2.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_autor;
    private String nome;
    @OneToMany
    private List<Book> books;

    public Autor(String nome) {
        this.nome = nome;
    }

    public Autor() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
