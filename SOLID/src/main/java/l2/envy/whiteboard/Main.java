package l2.envy.whiteboard;

import l2.envy.whiteboard.after.LibraryB;
import l2.envy.whiteboard.after.book.BookB;
import l2.envy.whiteboard.after.book.BookRegistry;
import l2.envy.whiteboard.after.book.HardBackBook;
import l2.envy.whiteboard.after.member.LibraryMember;
import l2.envy.whiteboard.after.member.MemberB;
import l2.envy.whiteboard.after.member.MemberManagement;
import l2.envy.whiteboard.after.reservation.BookReservation;
import l2.envy.whiteboard.after.reservation.Reservation;
import l2.envy.whiteboard.after.reservation.Reserver;
import l2.envy.whiteboard.before.Book;
import l2.envy.whiteboard.before.Library;
import l2.envy.whiteboard.before.Member;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Before SOLID
        Library library = new Library();
        library.addBook(new Book("Harry Potter", "Dobby The FREE Elf"));
        library.addBook(new Book("Harry Potter 2", "Ron Weasly"));
        library.addBook(new Book("Dracula", "Dracula"));
        library.addBook(new Book("Of Mice and Men", "Bill Boyles"));
        library.addBook(new Book("Interstellar", "Matthew McConnery"));

        Member m1 = new Member("Jonah Hill");
        Member m2 = new Member("Hellen Keller");

        library.registerMember(m1);
        library.registerMember(m2);

        library.checkoutBook(m1, new Book("Harry Potter", ""));
        library.checkoutBook(m2, new Book("Avatar: Way of the water", ""));

        //AFTER SOLID
        BookRegistry registry = null; /** = some implementation **/
        registry.addBook(new HardBackBook("Harry Potter", "Dobby The FREE Elf"));
        registry.addBook(new HardBackBook("Harry Potter 2", "Ron Weasly"));
        registry.addBook(new HardBackBook("Dracula", "Dracula"));
        registry.addBook(new HardBackBook("Of Mice and Men", "Bill Boyles"));
        registry.addBook(new HardBackBook("Interstellar", "Matthew McConnery"));

        MemberManagement management = null; /** = some implementation **/
        MemberB johna = new LibraryMember("Jonah", "Hill");
        management.registerMember(johna); // Could be preloaded from database

        Reserver reserver = null; /** some implementation **/
        reserver.addReservation(johna,new HardBackBook("Harry Potter 2", "Ron Weasly")); //again, could be loaded from database


        LibraryB libraryB = new LibraryB(registry, management, reserver); // Library takes all of these
        MemberB hellen = libraryB.registerNewUser("Hellen", "Keller"); //A new user registers

        List<BookB> collection = libraryB.getCurrentlyAvailableBooks(); //We want to look through the Collections of books
        BookB chosenBook = collection.get(0); //As an example, we just grab the first one we see.

        Reservation reservation = libraryB.reserveBook(hellen, chosenBook); //Lets reserve the book we liked.
        //Great! We got a reservation object back, now we can see details about the book we just reserved

        //Now we can see the information about it
        reservation.getDateReserved();
        reservation.getReservedBook();
        reservation.getDueDate();
        reservation.getMember();

        libraryB.getCurrentlyAvailableBooks(); // This will now have updated



    }
}