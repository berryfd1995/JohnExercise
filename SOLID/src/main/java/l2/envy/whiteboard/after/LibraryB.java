package l2.envy.whiteboard.after;

import l2.envy.whiteboard.after.book.BookB;
import l2.envy.whiteboard.after.book.BookRegistry;
import l2.envy.whiteboard.after.member.LibraryMember;
import l2.envy.whiteboard.after.member.MemberB;
import l2.envy.whiteboard.after.member.MemberManagement;
import l2.envy.whiteboard.after.reservation.Reservation;
import l2.envy.whiteboard.after.reservation.Reserver;

import java.util.List;

public class LibraryB { //Delegator & Facade
    private BookRegistry registry;
    private MemberManagement memberManagement;
    private Reserver reserver;
    public LibraryB(BookRegistry bookRegistry, MemberManagement memberManagement, Reserver reserver){
        this.registry = bookRegistry;
        this.memberManagement = memberManagement;
        this.reserver = reserver;
    }

    public MemberB registerNewUser(String firstname, String lastname){
        return memberManagement.registerMember(new LibraryMember(firstname, lastname));
    }

    public Reservation reserveBook(MemberB member, BookB book){
        return reserver.addReservation(member,book);
    }

    public MemberB[] findMember(String firstName, String lastName){
        return memberManagement.findMember(firstName, lastName);
    }

    public List<BookB> getCurrentlyAvailableBooks(){
        List<BookB> collection = registry.getCollection(); //Get all that this library manages
        for(BookB b : collection){ //Lets see if any book is reserved
            if(reserver.isBookReserved(b)){
                collection.remove(b); //If a book is reserved, then it isn't currently available
            }
        }
        return collection;
    }



}
