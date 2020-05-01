import java.util.ArrayList;
import java.util.Scanner;

public class BookDatabase {
    public static void main(String[] args) {
        // instantiate instances of books
        Book book1 = new Book("Java1001", "Head First Java\t", "Kathy Sierra and Bert Bates\t", "Easy to read Java workbook\t", "47.50");
        Book book2 = new Book("Java1002", "Thinking in Java\t", "Bruce Eckel\t", "Details about Java under the hood\t", "20.00");
        Book book3 = new Book("Orcl1003", "OCP: Oracle Certified Professional Java SE\t", "Jeanne Boyarsky\t", "Everything you need to know in one place\t", "45.00");
        Book book4 = new Book("Python1004", "Automate the Boring Stuff with Python\t", "Al Sweigart\t", "Fun with Python\t", "10.50");
        Book book5 = new Book("Zombie1005", "The Maker's Guide to the Zombie Apocalypse\t", "Simon Monk\t", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi\t", "16.50");
        Book book6 = new Book("Rasp1006", "Raspberry Pi Projects for the Evil Genius\t", "Donald Norris\t", "A dozen fiendishly fun projects for the Raspberry Pi!\t", "14.75");

        //populate database
        ArrayList<Book> database = new ArrayList<>();
        database.add(book1);
        database.add(book2);
        database.add(book3);
        database.add(book4);
        database.add(book5);
        database.add(book6);

        //get user input to search SKU
        Scanner input = new Scanner(System.in);
        String sku, selection;

        System.out.println("Welcome to the Book Database.");

        do {
            System.out.println("Select a number to continue.\n" +
                    "0 - Quit\n" +
                    "1 - Search book by SKU\n" +
                    "2 - Add book by SKU\n" +
                    "3 - List database entries\n");
            selection = input.nextLine();

            switch (selection) {
                case "1" -> {
                    System.out.println("Enter the SKU: ");
                    sku = input.nextLine();
                    searchBook(database, sku);
                }
                case "2" -> {
                    System.out.println("Enter the SKU of the book you want to add: ");
                    sku = input.nextLine();
                    database.add(addNewBook(sku));
                }
                case "3" -> listDatabase(database);
                default -> {
                    System.out.println("Goodbye!");
                    System.exit(1);
                }
            }
        } while (!selection.equals("0"));
        System.out.println("Goodbye!");
    }

    public static void searchBook(ArrayList<Book> bookdb, String sku) {
        boolean bookFound = false;
        for (Book book : bookdb) {
            if (book.isSameSKU(sku)) {
               book.getBookInfo();
               bookFound = true;
               break;
            }
        }
        if (!bookFound) {
            System.out.printf("A book with the SKU %s does not exist in the database.\n" +
                    "Would you like to add it? (y/n)\n", sku);
            Scanner input = new Scanner(System.in);
            String response = input.nextLine();
            if (response.equals("y")) {
                bookdb.add(addNewBook(sku));
            }
        }
    }

    public static Book addNewBook(String inputSKU) {
        Scanner input = new Scanner(System.in);
        Book newBook = new Book();
        newBook.setSku(inputSKU);
        System.out.println("Enter the Title: ");
        newBook.setTitle(input.nextLine());
        System.out.println("Enter the Author: ");
        newBook.setAuthor(input.nextLine());
        System.out.println("Enter the Description: ");
        newBook.setDescription(input.nextLine());
        System.out.println("Enter the Price (00.00 format): ");
        newBook.setPrice(input.nextLine());
        newBook.getBookInfo();

        return newBook;
    }

    public static void listDatabase(ArrayList<Book> db) {
        for (Book book : db) {
            book.getBookInfo();
        }
    }

}
