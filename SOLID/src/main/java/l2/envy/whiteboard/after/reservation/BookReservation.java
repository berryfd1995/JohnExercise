package l2.envy.whiteboard.after.reservation;

import l2.envy.whiteboard.after.book.BookB;
import l2.envy.whiteboard.after.member.MemberB;

import java.util.Date;

public class BookReservation implements Reservation{
    private BookB reservedBook;
    private MemberB member;
    private Date reserved;
    private Date due;

    public BookReservation(BookB reservedBook, MemberB member, Date reserved, Date due) {
        this.reservedBook = reservedBook;
        this.member = member;
        this.reserved = reserved;
        this.due = due;
    }

    @Override
    public BookB getReservedBook() {
        return reservedBook;
    }

    @Override
    public MemberB getMember() {
        return member;
    }

    @Override
    public Date getDateReserved() {
        return reserved;
    }

    @Override
    public Date getDueDate() {
        return due;
    }
}
