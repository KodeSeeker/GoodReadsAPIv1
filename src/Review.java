

public class Review {
    private int id;
    private int rating;
    private String content;
    private String author;
    private String authorLocation;
    private String dateAdded;
    private String recommendedFor;
   
    public Review() {
           
    }
   
    public void setId(int id) {
            this.id = id;
    }
   
    public int getId() {
            return id;
    }
   
    public int getRating() {
            return rating;
    }
   
    public void setRating(int rating) {
            this.rating = rating;
    }
   
    public String getRecommendedFor() {
            return recommendedFor;
    }
   
    public void setRecommendedFor(String recommendedFor) {
            this.recommendedFor = recommendedFor;
    }
   
    public String getDateAdded() {
            return dateAdded;
    }
   
    public void setDateAdded(String dateAdded) {
            this.dateAdded = dateAdded;
    }
   
    public String getContent() {
            return content;
    }
   
    public void setContent(String content) {
            this.content = content;
    }
   
    public String getAuthor() {
            return author;
    }
   
    public void setAuthor(String author) {
            this.author = author;
    }

    public void setAuthorLocation(String authorLocation) {
            this.authorLocation = authorLocation;
    }
   
    public String getAuthorLocation() {
            return authorLocation;
    }
    /*
     * private int rating;
    private String content;
    private String author;
    private String authorLocation;(non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Review: ");
            sb.append(id);
            sb.append("\n\t");
            sb.append(author);
            sb.append("\n\t");
            sb.append(authorLocation);
            sb.append("\n\t");
            sb.append(dateAdded);
            sb.append("\n\t");
            sb.append(recommendedFor);
            sb.append("\n\t");
            sb.append(content);
            return sb.toString();
    }
   
}
