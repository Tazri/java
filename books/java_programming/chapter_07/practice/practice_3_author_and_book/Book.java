package books.java_programming.chapter_07.practice.practice_3_author_and_book;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int stock = 0;

    // constructor
    public Book(String name,Author author,double price,int totalBooks){
        this.name = name;
        this.author = author;
        this.price = price;
        this.stock = totalBooks;
    }

    // getter
    public String getName(){
        return this.name;
    }

    public Author getAuthor(){
        return this. author;
    }

    public Double getPrice(){
        return this.price;
    }

    public int getTotalBooks(){
        return this.stock;
    }

    // setter
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    public void setTotalBooks(int totalBooks){
        this.stock = totalBooks;
    }
}
