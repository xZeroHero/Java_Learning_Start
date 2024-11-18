package basics.sql_anbindung.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * MariaDbMovieDao
 * <p>
 * 1. try-with-resource
 * 2. Verbindung zur Datenbank (DriverManager, Connection)
 * 3. Statement / PreparedStatement
 * 4. SQL String
 * 5. SQL Anweisung über das Statement ausführen (executeQuery,executeUpdate,execute)
 * 6. - wenn executeQuery: ResultSet "verarbeiten"
 * - executeUpdate,execute: ggf. Response auswerten
 *
 * @author Thomas Freese
 * @version 15.11.2024
 */
public class MariaDbMovieDao implements MovieDao {

    private Connection connection;

    public MariaDbMovieDao() throws SQLException {
        connection = DBConnection.getInstance();
    }

    @Override
    public void create(Movie movie) throws SQLException {
        String sql = "INSERT INTO movie (title, score) VALUES (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, movie.getTitle());
        preparedStatement.setDouble(2, movie.getScore());
        preparedStatement.executeUpdate();
        ResultSet resultSet = preparedStatement.getGeneratedKeys();
        if (resultSet.next()) {
            int primaryKey = resultSet.getInt(1);
            movie.setIdMovie(primaryKey);

        }

    }

    /**
     * Lese alle Filme
     *
     * @return Liste mit allen Filmen sortiert nach Titel
     */
    @Override
    public List<Movie> readAll() throws SQLException {
        List<Movie> movies = new ArrayList<>();
        Statement statement = connection.createStatement();
        String sql = "SELECT title, score FROM movie ORDER BY title";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String title = resultSet.getString("title");
            double score = resultSet.getDouble("score");
            Movie movie = new Movie(title, score);
            movies.add(movie);
        }
        return movies;
    }

    @Override
    public void update(Movie movie) throws SQLException {

        String sql = "UPDATE movie SET title= ?, score = ? WHERE id_movie = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, movie.getTitle());
        preparedStatement.setDouble(2, movie.getScore());
        preparedStatement.setInt(3, movie.getIdMovie());
        preparedStatement.executeUpdate();

    }

    @Override
    public void delete(Movie movie) throws SQLException {

        String sql = "DELETE FROM movie WHERE id_movie = " + movie.getIdMovie() ;
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

    }


}
