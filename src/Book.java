public class Book {
    String sku;
    String title;
    String author;
    String description;
    String price;

    Book (String sku, String title, String author, String description, String price) {
        this.sku = sku;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
    }

    public static String getBookInfo() {
        return String.format("SKU: %s Title: %s Author: %s Description: %s Price: $%s",
                sku, title, author, description, price);
    }


    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
