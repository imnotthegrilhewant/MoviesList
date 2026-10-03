package MoviesList;

import java.util.ArrayList;

public class MovieManager {
    private final ArrayList<Movie> movies = new ArrayList<>();
    
    public void addMovie(Movie m) {
        movies.add(m);
    }
    
    public ArrayList<Movie> getMovies() {
        return movies;
    }
    
    public void updateMovie(int index, String date, String title, String type, String genre, String subgenre, int rating) {
        if (index >= 0 && index < movies.size()) {
            Movie m = movies.get(index);
            m.setDate(date);
            m.setTitle(title);
            m.setType(type);
            m.setGenre(genre);
            m.setSubgenre(subgenre);
            m.setRating(rating);
        } else {
            throw new IndexOutOfBoundsException("Invalid index!");
        }
    }
    
    public void deleteMovie(int index) {
        if (index >= 0 && index < movies.size()) {
            movies.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index!");
        }
    }
}
