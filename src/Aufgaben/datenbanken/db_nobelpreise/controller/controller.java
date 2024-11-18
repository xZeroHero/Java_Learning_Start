package aufgaben.datenbanken.db_nobelpreise.controller;

import aufgaben.datenbanken.db_nobelpreise.Nobelpreis;
import aufgaben.datenbanken.db_nobelpreise.persistence.dao.NobelpreisDao;
import aufgaben.datenbanken.db_nobelpreise.view.ResultListView;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    public Controller() throws SQLException {


        List<Nobelpreis> nobelpreise = new ArrayList<>();
        NobelpreisDao nobelpreisDao = new NobelpreisDao();

//        nobelpreise = nobelpreisDao.readAll();
        nobelpreise = nobelpreisDao.readSubject("Peace");

        ResultListView resultListView = new ResultListView(nobelpreise);




    }
}
