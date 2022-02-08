package ru.netology.repository;

import ru.netology.domain.MovieItem;

public class MovieRepository {
    private MovieItem[] items = new MovieItem[0];

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
    public MovieItem findById(int id) {
        for (MovieItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
    public MovieItem[] removeAll(){
        MovieItem[] result=new MovieItem[0];
        items=result;
        return items;
    }

}
