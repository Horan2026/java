package test3;

import java.util.ArrayList;
import java.util.List;

public class BorrowBook {
    public static void main(String[] args) {
        Student student = new Student(1, "张三");

        BookForBorrow book = new BookForBorrow(123, "《java程序设计》");

        BorrowCard borrowCard = student.getBorrowCard();
        borrowCard.borrowBook(book);
        borrowCard.showBorrowedBooks();
        borrowCard.returnBook(book);
    }
}

class Student {
    private int id;
    private String name;
    private String sex;
    private BorrowCard borrowCard;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.sex = "男";
        this.borrowCard = new BorrowCard(this);
    }

    public BorrowCard getBorrowCard() {
        return borrowCard;
    }

    public String getName() {
        return name;
    }
}

class BookForBorrow {
    private int isbn;
    private String title;
    private boolean isBorrowed;

    public BookForBorrow(int isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        this.isBorrowed = false;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public String getTitle() {
        return title;
    }
}

class BorrowCard {
    private Student student;
    private List<BookForBorrow> borrowedBooks;

    public BorrowCard(Student student) {
        this.student = student;
        this.borrowedBooks = new ArrayList<>();
    }

    public boolean borrowBook(BookForBorrow book) {
        if (!book.isBorrowed()) {
            book.setBorrowed(true);
            borrowedBooks.add(book);
            System.out.println("成功借阅《" + book.getTitle() + "》");
            return true;
        } else {
            System.out.println("《" + book.getTitle() + "》已被借阅");
            return false;
        }
    }

    public boolean returnBook(BookForBorrow book) {
        if (book.isBorrowed()) {
            book.setBorrowed(false);
            borrowedBooks.remove(book);
            System.out.println("成功还回《" + book.getTitle() + "》");
            return true;
        } else {
            System.out.println("《" + book.getTitle() + "》未借阅");
            return false;
        }
    }

    public void showBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("当前没有借阅的书籍");
        } else {
            System.out.println(student.getName() + " 借阅的书籍:");
            for (BookForBorrow book : borrowedBooks) {
                System.out.println("- " + book.getTitle());
            }
        }
    }
}
