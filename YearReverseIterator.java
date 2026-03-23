package hw.ch01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class YearReverseIterator implements Iterator<Book> {
    private List<Book> sortedBooks;
    private int index = 0;

    public YearReverseIterator(BookShelf bookShelf) {
        this.sortedBooks = new ArrayList<>();
        for (int i = 0; i < bookShelf.getLength(); i++) {
            sortedBooks.add(bookShelf.getBookAt(i));
        }

        
        Collections.sort(sortedBooks, (b1, b2) -> Integer.compare(b2.getYear(), b1.getYear()));
    }

    @Override
    public boolean hasNext() {
        return index < sortedBooks.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return sortedBooks.get(index++);
    }
}