import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void addFilms() {
        Manager manager = new Manager();

        manager.addNewFilm("Film 1");
        manager.addNewFilm("Film 2");
        manager.addNewFilm("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void oneFilm() {
        Manager manager = new Manager();

        manager.addNewFilm("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void nullFilm() {
        Manager manager = new Manager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastFilm() {
        Manager manager = new Manager();

        manager.addNewFilm("Film 1");
        manager.addNewFilm("Film 2");
        manager.addNewFilm("Film 3");
        manager.addNewFilm("Film 4");
        manager.addNewFilm("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lessLimitFilms() {
        Manager manager = new Manager();

        manager.addNewFilm("Film 1");
        manager.addNewFilm("Film 2");
        manager.addNewFilm("Film 3");

        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void moreLimitFilms() {
        Manager manager = new Manager();

        manager.addNewFilm("Film 1");
        manager.addNewFilm("Film 2");
        manager.addNewFilm("Film 3");
        manager.addNewFilm("Film 4");
        manager.addNewFilm("Film 5");
        manager.addNewFilm("Film 6");
        manager.addNewFilm("Film 7");
        manager.addNewFilm("Film 8");
        manager.addNewFilm("Film 9");
        manager.addNewFilm("Film 10");


        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
