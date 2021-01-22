package ru.netology.manager;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerTest {


    AfishaManager manager = new AfishaManager(10);

    Movie first = new Movie(1, "Bloodshot", "actionMovie");
    Movie second = new Movie(2, "Onward", "cartoon");
    Movie third = new Movie(3, "HotelBelgrad", "comedy");
    Movie fourth = new Movie(4, "TheFastAndTheFurious", "actionMovie");
    Movie fifth = new Movie(5, "TheFastAndTheFurious 2", "actionMovie");
    Movie sixth = new Movie(6, "TheFastAndTheFurious 3", "actionMovie");
    Movie seventh = new Movie(7, "TheFastAndTheFurious 4", "actionMovie");
    Movie eighth = new Movie(8, "TheFastAndTheFurious 5", "actionMovie");
    Movie ninth = new Movie(9, "TheFastAndTheFurious 6", "actionMovie");
    Movie tenth = new Movie(10, "TheFastAndTheFurious 7", "actionMovie");
    Movie eleventh = new Movie(11, "TheFastAndTheFurious 8", "actionMovie");
    Movie twelfth = new Movie(12, "TheFastAndTheFurious 9", "actionMovie");

    @Test
    void shouldAdd() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        Movie[] actual = manager.showLastAddedItems();
        Movie[] expected = new Movie[]{fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldAddOverMax() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);

        Movie[] actual = manager.showLastAddedItems();
        Movie[] expected = new Movie[]{twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};

        assertArrayEquals(expected, actual);
    }

    @Test
    void getMovieListEmpty() {

        Movie[] actual = manager.showLastAddedItems();
        Movie[] expected = new Movie[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddMoreThanMax() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);

        Movie[] actual = manager.showLastAddedItems();
        Movie[] expected = new Movie[]{twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowLessThanMax() {
        AfishaManager manager = new AfishaManager(4);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        Movie[] actual = manager.showLastAddedItems();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowMinus() {
        AfishaManager manager = new AfishaManager(-1);

        manager.add(first);
        manager.add(third);
        manager.add(fifth);

        Movie[] actual = manager.showLastAddedItems();
        Movie[] expected = new Movie[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowMoreThan10() {
        AfishaManager manager = new AfishaManager(11);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        Movie[] actual = manager.showLastAddedItems();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
 }