package LibrarySystem;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "Author A");
        Book book2 = new Book("Python 101", "Author B");

        Member student = new StudentMember("Harika");
        Member faculty = new FacultyMember("Harika Vyakaranam");

        student.borrow(book1);
        faculty.borrow(book1);

        student.returnBook(book1);
        faculty.borrow(book1);

        faculty.returnBook(book2);
    }
}
