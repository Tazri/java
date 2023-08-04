package books.java_programming.chapter_07.practice.practice_3_author_and_book;

public class TestApp {
    public static void main(String args[]){
        Author author = new Author("Tamim Shahriar Subeen","book@subeen.com","Male");
        Book book = new Book("Computer Programming",author,250,1000);

        System.out.println("> Name of the book : "+book.getName());
        System.out.println("> Name of the author : "+book.getAuthor().getName());
        System.out.println("> Price of the book : "+book.getPrice());
        System.out.println("> Available in stock : "+book.getTotalBooks());
    }
}

/*
Output : 
> Name of the book : Computer Programming
> Name of the author : Tamim Shahriar Subeen
> Price of the book : 250.0
> Available in stock : 1000
*/