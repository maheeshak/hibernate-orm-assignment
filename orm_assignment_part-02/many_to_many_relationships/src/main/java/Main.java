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

        Author author2 = new Author();
        author2.setAuthor_id("A002");
        author2.setName("Kumarathunga Munidasa");
        author2.setEmail("munidasa@gmail.com");


        Book book = new Book();
        book.setBook_id("B001");
        book.setBook_title("Ape Gama");
        book.setBook_isbn("ISBN-001");


        Book book2 = new Book();
        book2.setBook_id("B002");
        book2.setBook_title("Madolduwa");
        book2.setBook_isbn("ISBN-002");


        List<Author> authors = new ArrayList<>();
        authors.add(author);
        authors.add(author2);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);

        author.setBooks(books);
        author.setBooks(books);

        author2.setBooks(books);
        author2.setBooks(books);

        book.setAuthors(authors);
        book2.setAuthors(authors);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(book);
        session.persist(book2);
        session.persist(author);
        session.persist(author2);

        transaction.commit();
        session.close();

    }
}
