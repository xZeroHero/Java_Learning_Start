package basics;

import basics.datenstruktur.Rechteck;

import java.util.Comparator;

public class CompareUmfang implements Comparator<Rechteck> {


    @Override
    public int compare(Rechteck r1, Rechteck r2) {
        int umfangR1 = (r1.getSeitenlaengeA()*2) + (r1.getSeitenlaengeB()*2);
        int umfangR2 = (r2.getSeitenlaengeA()*2) + (r2.getSeitenlaengeB()*2);

        if (umfangR1 == umfangR2) return 0;
        else if (umfangR1 > umfangR2) return 1;
        return -1;
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }
}
