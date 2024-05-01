import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();

        System.out.println(movies.size());

        movies.add(new Movie("Movie 1", 10, 2024, 9));
        movies.add(new Movie("Movie 2", 11, 2025, 7));
        movies.add(new Movie("Movie 3", 12, 2027, 4));

        for (Movie temp : movies)
            System.out.println(temp);

        movies.remove(new Movie("Movie 2", 11, 2025, 7));

        System.out.println();
        for (Movie temp : movies)
            System.out.println(temp);

        movies.set(0, new Movie("Zero", 18, 00, 10));
        System.out.println();

        for (Movie temp : movies)
            System.out.println(temp);

        for(Movie temp : movies)
            temp.setRatings(temp.getRatings()+1);

        System.out.println(movies.indexof(new Movie("Movie 3", 12, 2027, 4)));


    }
}
