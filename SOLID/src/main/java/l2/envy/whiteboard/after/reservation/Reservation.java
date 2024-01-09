package l2.envy.whiteboard.after.reservation;

import l2.envy.whiteboard.after.book.BookB;
import l2.envy.whiteboard.after.member.MemberB;

import java.util.Date;

public interface Reservation {
    BookB getReservedBook();

    MemberB getMember();

    Date getDateReserved();

    Date getDueDate();


}
