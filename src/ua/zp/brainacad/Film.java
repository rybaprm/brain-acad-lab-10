package ua.zp.brainacad;

public class Film {
    /**
     * Class Film that consist some private fields: title, duration, genre
     */
//    10 Блоки инициализации (Практика)
//1 Создание класса с блоком инициализации
//1.1 Создать класс Film. Описать поля: Название, продолжительность, жанр. Создать
//    конструктор с параметрами, геттеры и сеттеры.
//1.2 Добавить константные поля жанров, например: комедия, фантастика, ужасы.
//            Примечание, для создания экземпляра класса Film, пользоваться этими константами.
//1.3 Добавить блок инициализации в котором вывести на экран сообщение: «Создается
//    новый Фильм».
//    В конструкторе добавить вывод на экран сообщение: «Фильм “название”, успешно
//    создана.»

    /**
     * non static fields of class Film
     */
    private String title;
    private int duration;
    private int genre;

    /**
     * static fields of class Film
     */
    public static final int GENRE_COMEDY = 0;
    public static final int GENRE_FANTASY = 1;
    public static final int GENRE_HORROR = 2;

    /**
     * non static initialization block of class Film
     */ {
        System.out.println("Created new film");
    }

    /**
     * Declaration constructor Film() with parameter title, duration and genre
     */
    public Film(String title, int duration, int genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        System.out.println("Film \"" + this.title + "\" successfully created.");
    }

    /**
     * Declaration method which return value from private variable title;
     */
    public String getTitle() {
        return title;
    }

    /**
     * Declaration method which set value to private variable title;
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Declaration method which return value from private variable duration;
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Declaration method which set value to private variable duration;
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Declaration method which return value from private variable genre;
     */
    public int getGenre() {
        return genre;
    }

    /**
     * Declaration method which set value to private variable genre;
     */
    public void setGenre(int genre) {
        this.genre = genre;
    }
}
