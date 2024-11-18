package aufgaben.datenbanken.db_nobelpreise;

public class Nobelpreis {

    private int id_nobelpreis;
    private int year;
    private String subject;
    private String winner;


    public Nobelpreis() {
    }

    public Nobelpreis(int year, String subject, String winner) {
        this.year = year;
        this.subject = subject;
        this.winner = winner;
    }



    //GETTER & SETTER


    public int getId_nobelpreis() {
        return id_nobelpreis;
    }

    public void setId_nobelpreis(int id_nobelpreis) {
        this.id_nobelpreis = id_nobelpreis;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
