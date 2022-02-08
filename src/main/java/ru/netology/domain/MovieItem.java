package ru.netology.domain;

public class MovieItem {
    private int id;
    private String genreName;
    private String movieName;

    public MovieItem(int id, String genreName, String movieName) {
        this.id = id;
        this.genreName = genreName;
        this.movieName = movieName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
