
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GoodreadsParser {

        public GoodreadsParser() {

        }
       
        
        public Book parseBookWithReviews(String url){
        
        	Book book= new Book();
        	try{
        	DocumentBuilderFactory f =
                    DocumentBuilderFactory.newInstance();
            DocumentBuilder b = f.newDocumentBuilder();
            Document doc = b.parse(url);
            
            doc.getDocumentElement().normalize();
            System.out.println ("Root element: " +
                        doc.getDocumentElement().getNodeName());//prints GoodReadsResponse correctly
            NodeList bk = doc.getElementsByTagName("book");// single all encompassing element in response
            
            Node n= bk.item(0);// since the 0th node is id the 1st must be the title
            System.out.println("Node value"+n.getNodeValue());
            Element e=(Element)n;
            NodeList titleList= e.getElementsByTagName("title");//get the title
            Element titleElem = (Element) titleList.item(0);
            Node titleNode = titleElem.getChildNodes().item(0);// get the title value
            book.setTitle(titleNode.getNodeValue());
            System.out.println("Title in parser"+titleNode.getNodeValue());
            NodeList isbnList=e.getElementsByTagName("isbn");//get the isbn
            Element isbnElem = (Element) isbnList.item(0);
            Node isbnNode = isbnElem.getChildNodes().item(0);
            System.out.println("ISBN"+isbnNode.getNodeValue());
            book.setIsbn(isbnNode.getNodeValue());
        /*    NodeList isbnList=e.getElementsByTagName("isbn");//get the isbn
            Element isbnElem = (Element) isbnList.item(0);
            Node isbnNode = isbnElem.getChildNodes().item(0);
            System.out.println("ISBN"+isbnNode.getNodeValue());
            book.setIsbn(isbnNode.getNodeValue());
            */
        	}
        
       
        catch(Exception e){
        	
        	e.printStackTrace();
        }
            return book;
        }
        
        /*
        
        public List<Book> parseBookWithReviews(URL url) throws RuntimeException {
                System.out.println("We got HERE!");
        		SAXParserFactory spf = SAXParserFactory.newInstance();
               
                GoodreadsHandler handler = new GoodreadsHandler();
                try {
                	
                	 URLConnection connection = url.openConnection();
                     Document doc = parseXML(connection.getInputStream());
            
                     
                     
                     
                     
                     
                     NodeList descNodes = doc.getElementsByTagName("book");

                     for(int i=0; i<descNodes.getLength();i++)
                     {
                    	 System.out.println("we got here!");
                         System.out.println(descNodes.item(i).getTextContent());
                    	 Book bk  = new Book();
                    	 bk.setDescription(descNodes.item(i).getTextContent());
                    	 // bk.se
                    	 
                     }
                } catch (ParserConfigurationException e) {
                        throw new RuntimeException(e);
                } catch (SAXException e) {
                        throw new RuntimeException(e);
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
                /*
                 * getBook returns a book object from the API call
                 * Note: this book contains list of reviews.
                 */ //catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
        /*        
                for(Book b: handler.getBooks())
                	System.out.println("Detail"+b.getDescription());
                return handler.getBooks();
        }

        private Document parseXML(InputStream stream)
        	    throws Exception
        	    {
        	        DocumentBuilderFactory objDocumentBuilderFactory = null;
        	        DocumentBuilder objDocumentBuilder = null;
        	        Document doc = null;
        	        try
        	        {
        	            objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
        	            objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();

        	            doc = objDocumentBuilder.parse(stream);
        	        }
        	        catch(Exception ex)
        	        {
        	            throw ex;
        	        }       

        	        return doc;
        	    }
}*/
