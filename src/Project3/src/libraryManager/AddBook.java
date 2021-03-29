package libraryManager;
import java.util.ArrayList;
import java.util.Scanner;

public class AddBook {
    static ArrayList<Book> newBookList = new ArrayList<>();
    public static void main(String[] args) {
        userAdd();
        display();
    }

    public static void userAdd() {
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

    public static void addToList(String id, String title, String author, Boolean isBorrowed) {
        Book Book = new Book(id, title, author, isBorrowed);
        newBookList.add(Book);
    }


    /*Book book1 = new Book("B101","The flying bird", "Anny Miller", false);
    Book book2 = new Book("B102", "The darken part", "Brittney Green", true);
    Book book3 = new Book("B103", "A retired life", "Peter Howard", true);
    newBookList.add(book1);
    newBookList.add(book2);
    newBookList.add(book3);*/

    public static void display() {
        System.out.print("ID        Title                    Author           Is borrowed");
        for (Book book : newBookList) {
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

}
