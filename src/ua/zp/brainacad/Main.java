package ua.zp.brainacad;

public class Main {
    //3 Создать класс Main c методом main.
//    В методе main создать экземпляр класса Library.
//    Запустить программу, проверить порядок вывода сообщений.
//4 Написать метод, который находит первую пустую ячейку массива с фильмами и
//    возвращает индекс, если массив полностью заполнен возвращает -1.
//            4.1 В методе main реализовать проверку на наличие пустой ячейки и добавить в нее новый
//    фильм, если пустой ячейки уже нет – вывести сообщение: «Вы достигли лимита».
//            4.2 Запустить, проверить результат выполнения программы
//4.3 Повторить шаги 4.1 - 4.2, пока не будет достигнут лимит.
    public static void main(String[] args) {
        /**
         * Create instance of class Library and use method addFilmToLibrary
         * to adding to it instances of class Film
         */
        Library library = new Library("New library");
        library.addFilmToLibrary(new Film("Third film", 300, Film.GENRE_FANTASY));
        library.addFilmToLibrary(new Film("Fourth film", 400, Film.GENRE_HORROR));
        library.addFilmToLibrary(new Film("Fifth film", 500, Film.GENRE_FANTASY));
        library.addFilmToLibrary(new Film("Sixth film", 600, Film.GENRE_COMEDY));
        library.addFilmToLibrary(new Film("Seventh film", 700, Film.GENRE_HORROR));
    }
}