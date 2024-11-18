package aufgaben.datenbanken.db_weinhandel.view;

import aufgaben.datenbanken.db_weinhandel.Wein;
import java.util.List;

public class ResultListView {

    public ResultListView(List<Wein> weine) {
        print(weine);
    }

    public void print(List<Wein> weine){
        for (Wein wein : weine){
            System.out.printf("%-4d | %-60s | %4d | %5.2f | %4.2fL | %-25s | %-15s\n",
                    wein.getId_wein(),
                    wein.getName(),
                    wein.getJahr(),
                    wein.getPrice(),
                    wein.getInhalt(),
                    wein.getRegion(),
                    wein.getTyp()
                    );
        }
    }

}
