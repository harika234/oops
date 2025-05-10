package LibrarySystem;

public abstract class Member {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void borrow(Book book) {
        if (!book.isBorrowed()) {
            book.borrowBook();
            System.out.println(name + " borrowed \"" + book.getTitle() + "\"");
        } else {
            System.out.println("Book \"" + book.getTitle() + "\" is already borrowed.");
        }
    }

    public void returnBook(Book book) {
        if (book.isBorrowed()) {
            book.returnBook();
            System.out.println(name + " returned \"" + book.getTitle() + "\"");
        } else {
            System.out.println("Book \"" + book.getTitle() + "\" is not borrowed.");
        }
    }
}
