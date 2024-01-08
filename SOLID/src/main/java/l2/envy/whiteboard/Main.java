package l2.envy.whiteboard;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Harry Potter", "Dobby The FREE Elf"));
        library.addBook(new Book("Harry Potter 2", "Ron Weasly"));
        library.addBook(new Book("Dracula", "Dracula"));
        library.addBook(new Book("Of Mice and Men", "Bill Boyles"));
        library.addBook(new Book("Interstellar", "Matthew McConnery"));


        Member m1 = new Member("Jonah Hill");
        Member m2 = new Member("Hellen Keller");

        library.checkoutBook(m1, new Book("Harry Potter", ""));
        library.checkoutBook(m2, new Book("Avatar: Way of the water", ""));

    }
}