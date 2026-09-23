import java.util.ArrayList;

public class MovieTest {
    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Interstellar", 2014));
        movies.add(new Movie("Inception", 2010));
        movies.add(new Movie("Dune", 2021));

        for (int i = 0; i < movies.size(); i++) {
            Movie m = movies.get(i);

            if (m.getYear() >= 2015) {
                System.out.println(m.getTitle());
            }
        }
    }
}
