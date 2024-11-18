package aufgaben.datenbanken.db_nobelpreise.view;

import aufgaben.datenbanken.db_nobelpreise.Nobelpreis;
import aufgaben.datenbanken.db_weinhandel.Wein;

import java.util.List;

public class ResultListView {

    public ResultListView(List<Nobelpreis> nobelpreise) {
        print(nobelpreise);
    }

    public void print(List<Nobelpreis> nobelpreise){
        for (Nobelpreis nobelpreis : nobelpreise){
            System.out.printf("%-4d | %-4d | %-15s | %-30s \n",
                    nobelpreis.getId_nobelpreis(),
                    nobelpreis.getYear(),
                    nobelpreis.getSubject(),
                    nobelpreis.getWinner()
                    );
        }
    }

}
