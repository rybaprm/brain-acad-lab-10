package ua.zp.brainacad;

public class Library {
    /**
     * Class Library that consist some private fields: filmsArray and titleOfLibrary
     */
    //    2 Создать класс Library.
//    Описать поля: Массив из фильмов, название библиотеки.
//    Добавить блок инициализации в котором создается массив (с размером 5) для поля
//    списка фильмов.
//            2.1 Поле экземпляра класса «имя» пометить модификатором final.
//            2.2 Заполнить первые 2 элемента массива прямо в блоке инициализации. Создать 2 своих
//    любимых фильма, и добавить в массив.
//2.3 Вывести сообщения на экран: “Добавлены любимые фильмы”
//            2.4 Добавить конструктор для класса Library, который принимает и инициализирует имя
//    библиотеки. Вывести сообщение на экран: «Библиотека “название”, успешно создана.»
//            2.5 Создать геттеры для полей имя и список фильмов.
    /**
     * non static fields of class Library
     */
    private Film[] filmsArray;
    private final String titleOfLibrary;

    /**
     * non static initialization block of class Film which create filmsArray with 5 items and initialized
     * sam of them
     */ {
        filmsArray = new Film[5];
        filmsArray[0] = new Film("First favorite film", 100, Film.GENRE_COMEDY);
        filmsArray[1] = new Film("Second favorite film", 200, Film.GENRE_FANTASY);
        System.out.println("Added favorite movies.");

    }
    /**
     * Declaration constructor Library() with parameter titleOfLibrary
     */
    public Library(String titleOfLibrary) {
        this.titleOfLibrary = titleOfLibrary;
        System.out.println("Library \"" + this.titleOfLibrary + "\" successfully created.");
    }
    /**
     * Declaration method which return value from private variable FilmsArray;
     */
    public Film[] getFilmsArray() {
        return filmsArray;
    }
    /**
     * Declaration method which return value from private variable titleOfLibrary;
     */
    public String getTitleOfLibrary() {
        return titleOfLibrary;
    }

    /**
     * Declaration method which add instance of class Film to filmsArray;
     */
    public void addFilmToLibrary(Film film) {
        if (index_of_empty_filmsArray_element() != -1) {
            filmsArray[index_of_empty_filmsArray_element()] = film;
            System.out.println("Film \"" + film.getTitle() + "\" adding to the library.");
        } else {
            System.out.println("You have reached the limit for adding films to the library.");
        }
    }
    /**
     * Declaration method which check filmsArray for empty elements and return index of empty element
     * or negative value if filmsArray is full;
     */
    private int index_of_empty_filmsArray_element() {
        for (int i = 0; i < filmsArray.length; i++) {
            if (filmsArray[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
