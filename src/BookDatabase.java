import java.util.Scanner;

public class BookDatabase {
        /*
    [
      [SKU, Title, Author, Description, Price]
      [b1SKU, b1Title, b1Author, b1Description, b1Price]
      [b2,b2,b2,b2,b2]
    ]

    book database class contains many books
        can look up books by SKU
array list
if book doesn't exist', add it
     */
    public static void main(String[] args) {
        // instantiate database with books
        Book java1001 = new Book("Java1001\t", "Head First Java\t", "Kathy Sierra and Bert Bates\t", "Easy to read Java workbook\t", "47.50");
        Book java1002 = new Book("Java1002\t", "Thinking in Java\t", "Bruce Eckel\t", "Details about Java under the hood\t", "20.00");
        Book orcl1003 = new Book("Orcl1003\t", "OCP: Oracle Certified Professional Java SE\t", "Jeanne Boyarsky\t", "Everything you need to know in one place\t", "45.00");
        Book python1004 = new Book("Python1004\t", "Automate the Boring Stuff with Python\t", "Al Sweigart\t", "Fun with Python\t", "10.50");
        Book zombie1005 = new Book("Zombie1005\t", "The Maker's Guide to the Zombie Apocalypse\t", "Simon Monk\t", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi\t", "16.50");
        Book rasp1006 = new Book("Rasp1006\t", "Raspberry Pi Projects for the Evil Genius\t", "Donald Norris\t", "A dozen fiendishly fun projects for the Raspberry Pi!\t", "14.75");

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Book Database.\n" +
                "To search for a book, enter it's SKU: ");
        String sku = input.nextLine();
        // search arraylist for sku
            // if not exist, prompt to add
    }


}
