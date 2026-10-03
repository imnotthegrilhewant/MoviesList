package MoviesList;

public class Movie extends MediaItem {
    private String date;
    private String title;
    private String type;
    private String genre;
    private String subgenre;
    private int rating;
    
    public Movie(String date, String title, String type, String genre,String subgenre, int rating){
        super(title, type);
        this.date = date;
        this.title = title;
        this.type = type;
        this.genre = genre;
        this.subgenre = subgenre;
        this.rating = rating;
    }
    
    public String getDate() {
        return date;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getType() {
        return type;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public String getSubgenre() {
        return subgenre;
    }
    
    public int getRating() {
        return rating;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void setSubgenre(String subgenre) {
        this.subgenre = subgenre;
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }
}
