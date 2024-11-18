package basics.sql_anbindung.dao;

/**
 * Movie
 *
 * @author Thomas Freese
 * @version 14.11.2024
 */
public class Movie {
    private int idMovie;
    private String title;
    private double score;

    public Movie(String title, double score) {
        this.title = title;
        this.score = score;
    }

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

    @Override
    public String toString() {
        return title + " " + score;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }
}
