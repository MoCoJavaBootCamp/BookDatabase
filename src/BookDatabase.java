import java.util.ArrayList;
import java.util.Scanner;

public class BookDatabase {
    public static void main(String[] args) {
        // instantiate instances of books
        Book book1 = new Book("Java1001\t", "Head First Java\t", "Kathy Sierra and Bert Bates\t", "Easy to read Java workbook\t", "47.50");
        Book book2 = new Book("Java1002\t", "Thinking in Java\t", "Bruce Eckel\t", "Details about Java under the hood\t", "20.00");
        Book book3 = new Book("Orcl1003\t", "OCP: Oracle Certified Professional Java SE\t", "Jeanne Boyarsky\t", "Everything you need to know in one place\t", "45.00");
        Book book4 = new Book("Python1004\t", "Automate the Boring Stuff with Python\t", "Al Sweigart\t", "Fun with Python\t", "10.50");
        Book book5 = new Book("Zombie1005\t", "The Maker's Guide to the Zombie Apocalypse\t", "Simon Monk\t", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi\t", "16.50");
        Book book6 = new Book("Rasp1006\t", "Raspberry Pi Projects for the Evil Genius\t", "Donald Norris\t", "A dozen fiendishly fun projects for the Raspberry Pi!\t", "14.75");

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
        String sku;



        do {
            System.out.println("Welcome to the Book Database.\n" +
                    "Select a number to continue.\n" +
                    "0 - Quit\n" +
                    "1 - Search book by SKU\n" +
                    "2 - Add book by SKU\n");
            sku = input.nextLine();
            boolean bookFound = false;

            for (Book book : database) {
                if (book.isSameSKU(sku)) {
                    book.getBookInfo();
                    bookFound = true;
                    break;
                }
            }

            if (!bookFound) {
                System.out.printf("A book with the SKU %d does not exist in the database.\n" +
                        "Would you like to add it? (y/n)\n", sku);
                String response = input.nextLine();
                if (response.equals("y")) {
                    addBook();
                    bookFound = false;
                } else {

                }

            }
        } while (!sku.equals("0"));



        Book newBook;
        String title;
        String author;
        String description;
        String price;

        if (response.equals("y")) {
            newBook = new Book();
        }
            //after collecting values, add to arraylist database
    }

    public static String addBook() {

    }

}
