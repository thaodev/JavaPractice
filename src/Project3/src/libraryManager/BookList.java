package libraryManager;
import java.util.ArrayList;
import java.util.Scanner;

public class BookList {

    ArrayList<Book> myBooks = new ArrayList<>();

    public void add() {
        System.out.println("Enter information for your new book below: ");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the book id: ");
        String id = input.nextLine();

        System.out.print("Enter the book's title: ");
        String title = input.nextLine();

        System.out.print("Enter the book's author: ");
        String author = input.nextLine();

        System.out.print("Is the book borrowed? Enter 1 if yes and 0 if no: ");
        int choice = input.nextInt();
        Boolean isBorrowed = false;
        switch (choice) {
            case 1:
                isBorrowed = true;
            case 2:
                isBorrowed = false;
        }
        addToList(id, title, author, false);
        System.out.println("A new book has been added!");
    }

    public void addToList(String id, String title, String author, Boolean isBorrowed) {
        Book Book = new Book(id, title, author, isBorrowed);
        myBooks.add(Book);
    }

    public void search() {
       ArrayList<Book> booksFound = new ArrayList<>();
       System.out.println("Enter book title to search: ");
       Scanner src = new Scanner(System.in);
       String searchKey = src.next();

       for (Book book : myBooks) {
           if (book.getTitle().contains(searchKey)) {
               booksFound.add(book);
           }
       }

       if (booksFound.isEmpty()) {
           System.out.println("No book was found");
       } else {
           System.out.println(String.format("%-10s%-20s%-20s%-20s", "ID", "Title", "Author", "Is borrowed"));
           for (Book book : booksFound) {
               System.out.println(book.toString());
           }
       }
    }

    public void display() {
        System.out.print("ID        Title                    Author           Is borrowed");

        for (Book book : myBooks) {
            System.out.println();
            System.out.print(book.getId());
            for (int i = 0; i < 10 - book.getId().length(); i++) {
                System.out.print(" ");
            }
            System.out.print(book.getTitle());
            for (int i = 0; i < 25 - book.getTitle().length(); i++) {
                System.out.print(" ");
            }
            System.out.print(book.getAuthor());
            for (int i = 0; i < 17 - book.getAuthor().length(); i++) {
                System.out.print(" ");
            }
            System.out.print(book.getBorrowed());
            for (int i = 0; i < 10 - String.valueOf(book.getBorrowed()).length(); i++) {
                System.out.print(" ");
            }
        }
    }

    public void borrow() {
       System.out.println("Enter book ID to borrow: ");
       Scanner brr = new Scanner(System.in);
       String  searchId = brr.next();

       for (Book aBook : myBooks) {
           if (aBook.getId().equalsIgnoreCase(searchId)) {
               if (aBook.getBorrowed()) {
                   System.out.println(" You can not borrow this book. The book has been borrowed. Please come back and try next time!");
               }
               aBook.setBorrowed(true);
               System.out.println("You have successfully checking out the book: " + aBook.getTitle());
               return;
           }
           else {
               System.out.println("Unfortunately, our library doesn't have the book: " + aBook.getTitle());
           }
       }
    }

    public void exit() {
       System.out.println("you have successfully exit the program");
    }
}