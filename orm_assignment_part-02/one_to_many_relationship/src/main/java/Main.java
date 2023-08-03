import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Author author = new Author();
        author.setAuthor_id("A001");
        author.setName("Martin Wikramasinghe");
        author.setEmail("marting@gmail.com");

        Book book = new Book();
        book.setBook_id("B001");
        book.setBook_title("Ape Gama");
        book.setBook_isbn("ISBN-001");
        book.setAuthor(author);

        Book book2 = new Book();
        book2.setBook_id("B002");
        book2.setBook_title("Madolduwa");
        book2.setBook_isbn("ISBN-002");
        book2.setAuthor(author);

        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);

        author.setBook(books);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(book);
        session.persist(book2);
        session.persist(author);

        transaction.commit();
        session.close();

    }
}
