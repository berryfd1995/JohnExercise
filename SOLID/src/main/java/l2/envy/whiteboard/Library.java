package l2.envy.whiteboard;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void checkoutBook(Member member, Book book) {
        Book b = findBook(book);
        if (b != null) {
            member.getBorrowedBooks().add(book);
            books.remove(book);
            notifyMember(member, "Book checked out: " + book.getTitle());
        }else{
            notifyMember(member, "The book does not exist");
        }
    }

    private void notifyMember(Member member, String message) {
        System.out.println("TO: ["+member.getName() + "]  " + message);
    }
    private Book findBook(Book bookToFind){
        for (Book book : books){
            if(book.getTitle().toLowerCase().contains(bookToFind.getTitle().toLowerCase())){
                return book;
            }
        }
        return null;
    }
}
