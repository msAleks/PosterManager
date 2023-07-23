
public class Manager {
    private String[] films = new String[0];
    private int limit;


    public Manager() {
        this.limit = 5;
    }

    public Manager(int limit) {
        this.limit = limit;
    }


    public void addNewFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) { // копируем из старого в новый
            tmp[i] = films[i]; // копирование
        }
        tmp[tmp.length - 1] = film; // фильм, который хотим добавить
        films = tmp; // новая версия в поле
    }

    public String[] findAll() {
        return films; // возвращаем поле с фильмами
    }


    public String[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < films.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }

    public String[] findLast2() {
        int resultLength;
        if (films.length < 7) {
            resultLength = films.length;
        } else {
            resultLength = 7;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < films.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}