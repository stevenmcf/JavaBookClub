import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setUp(){
        book = new Book("Breakfast of Champions", "Kurt Vonnegut", "Satire");
    }
    @Test
    public void bookHasTitle(){
        assertEquals("Breakfast of Champions", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Kurt Vonnegut", book.getAuthor());
    }
    @Test
    public void  bookHasGenre(){
        assertEquals("Satire", book.getGenre());
    }


}
