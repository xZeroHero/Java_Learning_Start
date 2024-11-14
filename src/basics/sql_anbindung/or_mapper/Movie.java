package basics.sql_anbindung.or_mapper;

public class Movie {

    private String title;
    private double score;

    public Movie(String title, double score) {
        this.title = title;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("%-40s | Score: %.2f", title, score);
    }




    //GETTER & SETTER
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
