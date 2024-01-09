package l2.envy.whiteboard.after.member;

public interface MemberManagement {
    MemberB registerMember(MemberB member);
    void unregisterMember(MemberB member);
    MemberB[] findMember(String firstname, String lastname);


}
