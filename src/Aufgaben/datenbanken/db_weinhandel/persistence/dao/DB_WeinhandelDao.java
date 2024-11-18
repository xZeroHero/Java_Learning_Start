package aufgaben.datenbanken.db_weinhandel.persistence.dao;

import aufgaben.datenbanken.db_weinhandel.Wein;

import java.sql.SQLException;
import java.util.List;


public interface DB_WeinhandelDao {

    List<Wein> readAll() throws SQLException;

    void create(Wein wein) throws SQLException;

    void update(Wein wein) throws SQLException;

    void delete(Wein wein) throws SQLException;

}
