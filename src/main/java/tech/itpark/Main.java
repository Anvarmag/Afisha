package tech.itpark;

import tech.itpark.domain.Film;
import tech.itpark.manager.FilmManager;

public class Main {
    public static void main(String[] args) {
        FilmManager manager = new FilmManager();
        Film film1 = new Film(
                1,
                "Пара из будущего",
                7.1,
                "Дата",
                "Постер",
                "Ссылка на фильм",
                "Лайк",
                "Наличие билетов");
        Film film2 = new Film(
                2,
                "Райя и последний дракон",
                7.8,
                "Дата",
                "Постер",
                "Ссылка на фильм",
                "Лайк",
                "Наличие билетов");
        Film film3 = new Film(
                3,
                "Батя",
                7.3,
                "Дата",
                "Постер",
                "Ссылка на фильм",
                "Лайк",
                "Наличие билетов");

    }
}