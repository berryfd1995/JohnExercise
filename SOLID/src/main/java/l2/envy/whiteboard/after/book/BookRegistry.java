package l2.envy.whiteboard.after.book;

import java.util.List;

public interface BookRegistry {
    void addBook(BookB book);
    void removeBook(BookB book);
    BookB[] lookupBook(String title, String author);
    List<BookB> getCollection();
}
