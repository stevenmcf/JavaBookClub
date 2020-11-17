import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book2;
    private Book book3;

    @Before
    public void setUp(){
        library = new Library(20);
        book = new Book("Breakfast of Champions", "Kurt Vonnegut", "Satire");
        book2 = new Book("The Twits", "Roald Dahl", "Childrens");
        book3 = new Book("Finding Ultra", "Rich Roll", "Sports");
    }

    @Test
    public void canCountStock(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBookToStock(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.stockCount());
    }

    @Test
    public void libraryIsAtCapacitySoCannotAddBook(){
        library = new Library(1);
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(1, library.stockCount());
    }

}
