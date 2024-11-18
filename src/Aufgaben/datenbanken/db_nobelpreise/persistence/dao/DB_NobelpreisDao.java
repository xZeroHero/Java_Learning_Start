package aufgaben.datenbanken.db_nobelpreise.persistence.dao;

import aufgaben.datenbanken.db_nobelpreise.Nobelpreis;
import aufgaben.datenbanken.db_weinhandel.Wein;

import java.sql.SQLException;
import java.util.List;

public interface DB_NobelpreisDao {

    List<Nobelpreis> readAll() throws SQLException;



}
