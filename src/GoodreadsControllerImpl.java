import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GoodreadsControllerImpl implements GoodreadsController {
    //example URL: http://www.goodreads.com/book/title?format=xml&title=godel&key=T9HvOKynXDa6RhS1DvGeQ
   
    private GoodreadsParser goodreadsParser;
   
    public GoodreadsControllerImpl() {
            goodreadsParser = new GoodreadsParser();
    }
   
    public List<Book> searchBookByTitle(String searchfield) {
            StringBuffer sb = new StringBuffer();
            //construct api call
            sb.append(goodreadsAPI).append("book/title?format=xml&key=").append(goodreadsKey).append("&title=").append(searchfield);
            System.out.println("Search Book by Title"+sb.toString());
            try {
                    return goodreadsParser.parseBookWithReviews(new URL(sb.toString()));
            } catch (MalformedURLException e) {
                    e.printStackTrace();
                    return new ArrayList<Book>();
            } catch (RuntimeException e) {
                    e.printStackTrace();
                    return new ArrayList<Book>();
            }
    }

    public List<Book> searchBookByAuthor(String searchField) {
            // TODO Auto-generated method stub
            return null;
    }

    public Book searchBookByISBN(String searchField) throws MalformedURLException, IOException {
            StringBuffer sb = new StringBuffer();
            //construct api call
            sb.append(goodreadsAPI).append("book/isbn?format=xml&isbn=").append(searchField).append("&key=").append(goodreadsKey);
           System.out.println("Search Book By ISBN"+sb.toString());
            try {
                    return goodreadsParser.parseBookWithReviews(new URL(sb.toString())).get(0);
            } catch (MalformedURLException e) {
                    e.printStackTrace();
                    return null;
            } catch (RuntimeException e) {
                    e.printStackTrace();
                    return null;
            }

    }
   
   
}
