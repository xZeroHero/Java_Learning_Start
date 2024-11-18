package aufgaben.datenbanken.db_weinhandel.controller;

import aufgaben.datenbanken.db_weinhandel.Wein;
import aufgaben.datenbanken.db_weinhandel.persistence.dao.WeinDao;
import aufgaben.datenbanken.db_weinhandel.view.ResultListView;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    public Controller() throws SQLException {

        WeinDao weinDao = new WeinDao();

/*        Wein testWein = new Wein("Test", 2020, 30.50, 0.75,"Hier", "Rotwein");
        weinDao.create(testWein);
        weinDao.delete(testWein);*/


        List<Wein> weine = new ArrayList<>();
//        weine = weinDao.readAll();
//        weine = weinDao.readType("Rot");
//        weine = weinDao.readPriceInRange(3,5);
//        weine = weinDao.readRegion("Alkoholfrei");

        ResultListView resultListView = new ResultListView(weine);

    }
}
