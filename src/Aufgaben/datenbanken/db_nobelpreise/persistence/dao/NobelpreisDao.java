package aufgaben.datenbanken.db_nobelpreise.persistence.dao;

import aufgaben.datenbanken.db_nobelpreise.Nobelpreis;
import aufgaben.datenbanken.db_nobelpreise.persistence.DBConnection;
import aufgaben.datenbanken.db_weinhandel.Wein;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NobelpreisDao implements DB_NobelpreisDao{

    private Connection connection;

    public NobelpreisDao() throws SQLException {
        connection = DBConnection.getInstance();
    }


    public Nobelpreis resultSetToNobelpreis(ResultSet resultSet) throws SQLException{
        Nobelpreis nobelpreis = new Nobelpreis();
        nobelpreis.setYear(resultSet.getInt("year"));
        nobelpreis.setSubject(resultSet.getString("subject"));
        nobelpreis.setWinner(resultSet.getString("winner"));

        return nobelpreis;

    }

    public List<Nobelpreis> resultSetToList(ResultSet resultSet) throws SQLException {
        List<Nobelpreis> nobelpreise = new ArrayList<>();

        while (resultSet.next()){
            nobelpreise.add(resultSetToNobelpreis(resultSet));
        }

        return nobelpreise;
    }


    @Override
    public List<Nobelpreis> readAll() throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "Select * from nobelpreise";
        ResultSet resultSet = statement.executeQuery(sql);

        return resultSetToList(resultSet);
    }


    public List<Nobelpreis> readSubject(String subject) throws SQLException {

        String sql = "Select * from nobelpreise WHERE subject like ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%" + subject + "%");
        ResultSet resultSet = preparedStatement.executeQuery();



        return resultSetToList(resultSet);
    }


}
