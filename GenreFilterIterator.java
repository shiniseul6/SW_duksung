package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenreFilterIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private String targetGenre;
    private int index = 0;

    public GenreFilterIterator(BookShelf bookShelf, String genre) {
        this.bookShelf = bookShelf;
        this.targetGenre = genre;
    }

    @Override
    public boolean hasNext() {
        while (index < bookShelf.getLength()) {
            if (bookShelf.getBookAt(index).getGenre().equals(targetGenre)) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Book next() {
        if (!hasNext()) throw new NoSuchElementException();
        return bookShelf.getBookAt(index++);
    }
}