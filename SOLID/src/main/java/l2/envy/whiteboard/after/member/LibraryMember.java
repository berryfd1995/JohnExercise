package l2.envy.whiteboard.after.member;

public class LibraryMember implements MemberB {
    private String firstname;
    private String lastname;

    public LibraryMember(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String getFirstName() {
        return firstname;
    }

    @Override
    public String getLastName() {
        return lastname;
    }
}
