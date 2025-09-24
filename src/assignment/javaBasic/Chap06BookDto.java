package assignment.javaBasic;

public class Chap06BookDto {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    Chap06BookDto() {};

    Chap06BookDto(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    Chap06BookDto(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    public void printInfo() {
        System.out.println(title + " " + publisher + " " + author + " " + price + " " + discountRate);
    }


    // Getter & Setter
    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
