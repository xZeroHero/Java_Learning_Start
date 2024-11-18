package aufgaben.datenbanken.db_weinhandel.persistence.dao;

import aufgaben.datenbanken.db_weinhandel.Wein;
import aufgaben.datenbanken.db_weinhandel.persistence.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WeinDao implements DB_WeinhandelDao {

    private Connection connection;

    public WeinDao() throws SQLException {
        connection = DBConnection.getInstance();
    }


    public List<Wein> readType(String typ) throws SQLException {

        String sql = "SELECT id_wein, `name`, jahr, preis,inhalt, region, typ From weine WHERE typ like ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%" + typ + "%");
        ResultSet resultSet = preparedStatement.executeQuery();

        return ResultSetToList(resultSet);
    }

    public List<Wein> readPriceInRange(double start, double end) throws SQLException {

        String sql = "SELECT id_wein, `name`, jahr, preis,inhalt, region, typ From weine WHERE preis between ? and ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setDouble(1, start);
        preparedStatement.setDouble(2, end);
        ResultSet resultSet = preparedStatement.executeQuery();

        return ResultSetToList(resultSet);
    }

    public List<Wein> readRegion(String region) throws SQLException {

        String sql = "SELECT id_wein, `name`, jahr, preis,inhalt, region, typ From weine WHERE region like ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%" + region + "%");
        ResultSet resultSet = preparedStatement.executeQuery();

        return ResultSetToList(resultSet);
    }




    public Wein ResultSetToWein(ResultSet resultSet) throws SQLException{
        Wein wein = new Wein();
        wein.setId_wein(resultSet.getInt("id_wein"));
        wein.setName(resultSet.getString("name"));
        wein.setJahr(resultSet.getInt("jahr"));
        wein.setPrice(resultSet.getDouble("preis"));
        wein.setInhalt(resultSet.getDouble("inhalt"));
        wein.setRegion(resultSet.getString("region"));
        wein.setTyp(resultSet.getString("typ"));
        return wein;

    }

    public List<Wein> ResultSetToList(ResultSet resultSet) throws SQLException {
        List<Wein> weine = new ArrayList<>();

        while (resultSet.next()){
            weine.add(ResultSetToWein(resultSet));
        }

        return weine;
    }


    //CRUD

    @Override
    public void create(Wein wein) throws SQLException {

        String sql = "INSERT INTO weine (name, jahr, preis,inhalt, region, typ) VALUES (?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        preparedStatementComplete(wein, preparedStatement);
        ResultSet resultSet = preparedStatement.getGeneratedKeys();

        if (resultSet.next()){
            wein.setId_wein(resultSet.getInt(1));
        }

    }


    @Override
    public List<Wein> readAll() throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "SELECT id_wein, `name`, jahr, preis, inhalt, region, typ From weine";
        ResultSet resultSet = statement.executeQuery(sql);

        return ResultSetToList(resultSet);
    }



    @Override
    public void update(Wein wein) throws SQLException {
        String sql = STR."UPDATE weine SET name = ?,jahr = ?,preis = ?,inhalt = ?,region = ?,typ = ? WHERE id_wein =\{wein.getId_wein()}";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatementComplete(wein, preparedStatement);

    }

    @Override
    public void delete(Wein wein) throws SQLException {
        String sql = STR."DELETE from weine where id_wein=\{wein.getId_wein()}";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);


    }

    private void preparedStatementComplete(Wein wein, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setString(1, wein.getName());
        preparedStatement.setInt(2, wein.getJahr());
        preparedStatement.setDouble(3, wein.getPrice());
        preparedStatement.setDouble(4, wein.getInhalt());
        preparedStatement.setString(5, wein.getRegion());
        preparedStatement.setString(6, wein.getTyp());
        preparedStatement.executeUpdate();
    }
}
