package test3;

import java.util.Scanner;

public class Book {
    String bookNo;
    String bookTitle;
    String author;
    int yearPublished;

    public Book(String bookNo, String bookTitle, String author, int yearPublished){
        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearPublished = yearPublished;
    }
   public static void main(String[] args){

       Book b1 = new Book("ISBN123456789", "Java Programming", "John Doe", 2024);
       Book b2 = new Book("ISBN987654321", "Data Structures", "Jane Smith", 2023);

       System.out.println("b1:");
       b1.showBookNo();
       b1.showBookTitle();
       b1.showAuthor();
       b1.showYearPublished();

       System.out.println("\nb2:");
       b2.showBookNo();
       b2.showBookTitle();
       b2.showAuthor();
       b2.showYearPublished();

       b1.modifyYearPublished();


   }
    void showBookNo(){
    System.out.println("test3.Book No:" + bookNo);
    }
    void showBookTitle(){
    System.out.println("test3.Book Title:" + bookTitle);
    }
    void showAuthor(){
    System.out.println("Author:" + author);
    }
    void showYearPublished(){
    System.out.println("Year Published:" + yearPublished);
    }
    void modifyYearPublished(){
    System.out.println("Please input the new year published:");
    Scanner sc = new Scanner(System.in);
    int newYearPublished = sc.nextInt();
    yearPublished = newYearPublished;
    System.out.println("New Year Published:" + yearPublished);
    }
}
