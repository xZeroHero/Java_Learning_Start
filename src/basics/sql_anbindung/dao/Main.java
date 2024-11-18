package basics.sql_anbindung.dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Main
 *
 * @author Thomas Freese
 * @version 15.11.2024
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        MovieDao dao = new MariaDbMovieDao();
        List<Movie> movies = dao.readAll();

        System.out.println(movies);

        Movie movie = new Movie("FI12 - The Movie", 11.0);
        dao.create(movie);

        System.out.println(movie.getIdMovie());


        movie.setScore(20.0);
        dao.update(movie);

        dao.delete(movie);

    }
}
