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

        char resp;
        do{
            System.out.println("___sistema de gerenciamento de livros___");
            System.out.println("digite 1 para cadastrar um autor");
            System.out.println("digite 2 para cadastrar um livro");
            System.out.println("digite 3 para pesquisar um livro por ID");
            System.out.println("digite 0 para encerrar o programa");
            resp = sc.next().charAt(0);

            Autor a1 = new Autor();
            Book b1 = new Book();




                if(resp =='1'){
                    System.out.println("insert name of author");
                    String nome = sc.next();
                    a1.setNome(nome);
                    ConnectionDAO.connectionDAOautor(a1);
                    System.out.println("autor cadastrado com sucesso!!!");
                }
                if(resp == '2'){
                    System.out.println("insert tittle of book");
                    String title = sc.next();
                    sc.nextLine();
                    b1.setTittle(title);
                    List<Book> books = new ArrayList();
                    books.add(b1);
                    System.out.println("insert ID from author of book");
                    Long idautor = sc.nextLong();
                    Autor autor = ConnectionDAO.findAuthorBYId(idautor);
                    if(autor != null){
                        b1.setAutor(autor);
                        ConnectionDAO.connectionDAObook(b1);
                    }else{
                        System.out.println("AUTOR NAO ENCONTRADO");
                    }
                }
                if(resp == '3'){
                    System.out.println("insira o id do livro para buscar no banco de dados");
                    Long id = sc.nextLong();

                    Book book = ConnectionDAO.findBookById(id);
                    System.out.println(book.getTittle());
                    Autor autor = book.getAutor();
                    System.out.println(autor.getNome());
                }
        }while(resp!='0');
        }
}