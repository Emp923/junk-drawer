import java.math.BigDecimal;

public class Book {
    private String title;
    private String author;
    private BigDecimal price;

    public Book(String title, String author, String price) {
         this.title = title;
         this.author  = author;
         this.price = new BigDecimal(price);
    }
    
    public String toString() {
        return getTitle() + " - " + getAuthor() + "\n$" + getPrice();
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}