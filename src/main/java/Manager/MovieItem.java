package Manager;

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

}
