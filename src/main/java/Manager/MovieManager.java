package Manager;

import Manager.MovieItem;

public class MovieManager {
    private int resultLength = 3;
    private MovieItem[] items = new MovieItem[0];


    public MovieManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public MovieManager() {
    }

    public void save(MovieItem item) {
        MovieItem[] tmt = new MovieItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmt[i] = items[i];
        }
        tmt[tmt.length - 1] = item;
        items = tmt;
    }

    public void removeId(int id) {
        MovieItem[] tmt = new MovieItem[items.length - 1];
        int index = 0;
        for (MovieItem item : items) {
            if (item.getId() != id) {
                tmt[index] = item;
                index++;
            }
            items = tmt;
        }
    }

    public MovieItem[] findAll() {
        return items;
    }

    public MovieItem[] getAllItems() {
        if (resultLength < items.length) {
            resultLength = this.resultLength;
        } else {
            resultLength = items.length;
        }
        MovieItem[] result = new MovieItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;

    }
}
