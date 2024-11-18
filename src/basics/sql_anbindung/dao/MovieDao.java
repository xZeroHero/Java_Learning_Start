package basics.sql_anbindung.dao;

import java.sql.SQLException;
import java.util.List;

public interface MovieDao {
    List<Movie> readAll() throws SQLException;
    List<Movie> read(String name) throws SQLException;

    void create(Movie movie) throws SQLException;

    void update(Movie movie) throws SQLException;

    void delete(Movie movie) throws SQLException;
}
