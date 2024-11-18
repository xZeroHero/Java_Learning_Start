package basics.sql_anbindung.dao.controller;

import basics.sql_anbindung.dao.MariaDbMovieDao;
import basics.sql_anbindung.dao.Movie;
import basics.sql_anbindung.dao.MovieDao;

import java.sql.SQLException;
import java.util.List;

public class Controller {

    public Controller() throws SQLException {

        MovieDao dao = new MariaDbMovieDao();
        List<Movie> movies = dao.readAll();

//        System.out.println(movies);

        Movie movie = new Movie("FI12 - The Movie", 11.0);
//        dao.create(movie);

        System.out.println(movie.getIdMovie());


        movie.setScore(20.0);
//        dao.update(movie);

//        dao.delete(movie);

        List<Movie> movies2 = dao.read("Rocky");

        System.out.println(movies2);

    }

}

