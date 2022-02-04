package Manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {
    private MovieManager manager=new MovieManager(5);
    private MovieManager manager2= new MovieManager();
    private MovieItem first;
    private MovieItem second;
    private MovieItem third;
    private MovieItem fourth;
    private MovieItem fifth;
    private MovieItem sixth;
    private MovieItem seven;


    @BeforeEach
    void setUp() {
        first = new MovieItem(1, "horror", "American history");
        second = new MovieItem(2, "action", "SpiderMan");
        third = new MovieItem(3, "serial", "Peaky Blinders");
        fourth = new MovieItem(4, "serial", "Better call Soul");
        fifth = new MovieItem(10, "action", "Gentleman");
        sixth = new MovieItem(6, "fantasy", "Hobbits");
        seven = new MovieItem(7, "serial", "MadMan");

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);

        manager2.save(first);
        manager2.save(second);
        manager2.save(third);
        manager2.save(fourth);
        manager2.save(fifth);
        manager2.save(sixth);

    }


    @Test
    void save() {
        MovieItem[] expected = {first, second, third, fourth, fifth, sixth, seven};
        MovieItem[] actual = manager.save(seven);
        assertArrayEquals(actual, expected);
    }

    @Test
    void removeId() {
        manager.save(seven);
        MovieItem[] actual = manager.removeId(7);
        MovieItem[] expected = {first, second, third, fourth, fifth, sixth};
        assertArrayEquals(actual, expected);
    }

    @Test
    void findAll() {
        MovieItem[] actual = manager.findAll();
        MovieItem[] expected = {first, second, third, fourth, fifth, sixth};
        assertArrayEquals(actual, expected);
    }

    @Test
    void getAllItems() {
        MovieItem[] actual = manager.getAllItems();
        MovieItem[] expected={sixth,fifth,fourth,third,second};
        assertArrayEquals(actual, expected);

    }
   @Test
    void getAllItemFromManager2(){
        MovieItem[] actual= manager2.getAllItems();
        MovieItem [] expected={sixth,fifth,fourth,third,second,first};
        assertArrayEquals(actual, expected);
   }
}