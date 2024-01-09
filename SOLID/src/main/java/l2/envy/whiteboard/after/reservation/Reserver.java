package l2.envy.whiteboard.after.reservation;

import l2.envy.whiteboard.after.book.BookB;
import l2.envy.whiteboard.after.member.MemberB;

import java.util.List;

public interface Reserver {

    List<Reservation> getMemberReservation(MemberB member);

    boolean isBookReserved(BookB book);
    Reservation addReservation(MemberB member, BookB book);

    void returnBook(BookB book);
}
