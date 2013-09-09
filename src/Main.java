import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
/*
public class Main extends Activity {
    /** Called when the activity is first created. */
      //  private GoodreadsControllerImpl goodreadsController;
   // @Override
  /*  public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        goodreadsController = new GoodreadsControllerImpl();
        List<Book> listOfBooks = goodreadsController.searchBookByTitle("godel");
        Book book = null;
        try {
                        book = goodreadsController.searchBookByISBN("0441172717");
                       
                } catch (MalformedURLException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }
                System.out.println("\n\n\n\n\n");
                System.out.println(listOfBooks);
                System.out.println("\n\n\n\n\n");
                System.out.println(book);
    }
}
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final GoodreadsControllerImpl goodreadsController;
		goodreadsController=new GoodreadsControllerImpl();
		List<Book> listOfBooks = goodreadsController.searchBookByTitle("Dune");
		 Book book = null;
	        try {
	                        book = goodreadsController.searchBookByISBN("0441172717");
	                       
	                } catch (MalformedURLException e) {
	                        e.printStackTrace();
	                } catch (IOException e) {
	                        e.printStackTrace();
	                }
	                System.out.println("\n\n\n\n\n");
	                System.out.println(listOfBooks);
	                System.out.println("\n\n\n\n\n");
	                System.out.println(book);
	}

}
