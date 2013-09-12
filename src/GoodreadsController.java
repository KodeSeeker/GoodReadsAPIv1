
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;


public interface GoodreadsController {
        static final String goodreadsAPI = "http://www.goodreads.com/";
        static final String goodreadsKey = "h65ovqBYpx8PUOX6WlOMQ";
        static final String NO_BOOKID = "No book with that ISBN";
        public Book searchBookByTitle(String searchField);
        public List<Book> searchBookByAuthor(String searchField);
        public Book searchBookByISBN(String searchField) throws MalformedURLException, IOException;
       
}

