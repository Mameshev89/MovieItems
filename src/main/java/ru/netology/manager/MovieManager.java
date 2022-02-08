package ru.netology.manager;

import ru.netology.domain.MovieItem;
import ru.netology.repository.MovieRepository;

public class MovieManager {
    private int resultLength = 3;
    private MovieRepository repository;
    private MovieItem[] items = new MovieItem[0];

    public MovieManager(int resultLength, MovieRepository repository) {
        this.resultLength = resultLength;
        this.repository = repository;
    }

    public MovieManager(MovieRepository repository) {
        this.repository = repository;
    }

    public MovieManager() {
    }

    public void add(MovieItem item) {
        repository.save(item);
    }

    public MovieItem[] lastFilm() {
        MovieItem[] result = repository.findAll();
        MovieItem[] tmt = new MovieItem[Math.min(result.length, resultLength)];
        for (int i = 0; i < tmt.length; i++) {
            tmt[i] = result[result.length - i - 1];
        }
        return tmt;
    }

    public MovieItem findIdObj(int id) {
        MovieItem result = repository.findById(id);
        return result;
    }

    public MovieItem[] deleteAllObj() {
        MovieItem[] result = repository.removeAll();
        return result;
    }

    public void removeIdElements(int id) {
        repository.removeId(id);
    }

    public MovieItem[] findAllObj() {
        MovieItem[] result = repository.findAll();
        return result;
    }
}
