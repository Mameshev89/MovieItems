package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;
import ru.netology.repository.MovieRepository;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    private final MovieRepository repo = new MovieRepository();
    MovieManager manager = new MovieManager(5, repo);
    MovieManager manager2 = new MovieManager();
    MovieManager manager3 = new MovieManager(repo);

    // MovieManager managerSenior=new MovieManager();
    private MovieItem first = new MovieItem(1, "horror", "American history");
    private MovieItem second = new MovieItem(2, "action", "SpiderMan");
    private MovieItem third = new MovieItem(3, "serial", "Peaky Blinders");
    private MovieItem fourth = new MovieItem(4, "serial", "Better call Soul");
    private MovieItem fifth = new MovieItem(10, "action", "Gentleman");
    private MovieItem sixth = new MovieItem(6, "fantasy", "Hobbits");
    private MovieItem seven = new MovieItem(7, "serial", "MadMan");

    @BeforeEach
    void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);



    }

    @Test
    void removeById() {
        manager.removeIdElements(10);
        MovieItem[] actual = new MovieItem[]{first, second, third, fourth, sixth};
        MovieItem[] expected = manager.findAllObj();
        assertArrayEquals(actual, expected);
    }

    @Test
    void removeAl() {
        manager.deleteAllObj();
        MovieItem[] actual = new MovieItem[]{};
        MovieItem[] expected = manager.findAllObj();
        assertArrayEquals(actual, expected);
    }

    @Test
    void findByIdl() {
        MovieItem expected = fifth;
        MovieItem actual = manager.findIdObj(10);
        assertEquals(expected, actual);

    }

    @Test
    void findByI() {
        MovieItem expected = null;
        MovieItem actual = manager.findIdObj(7);
        assertEquals(expected, actual);

    }

    @Test
    void get() {

        MovieItem[] actual = manager.lastFilm();
        MovieItem[] expected = new MovieItem[]{sixth, fifth, fourth, third, second};
        assertArrayEquals(actual, expected);
    }



}