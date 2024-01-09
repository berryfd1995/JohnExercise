package l2.envy.whiteboard.after.book;

public class SoftCoverBook implements BookB {

    private String name;
    private String author;

    public SoftCoverBook(String name, String author) {
        this.name = name;
        this.author = author;
        }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    /** Maybe some other implementations **/
}
