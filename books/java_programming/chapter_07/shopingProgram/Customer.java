package books.java_programming.chapter_07.shopingProgram;

public class Customer {
    private String name;
    private CreditCard creditCard;

    public Customer(String name,long number, int cvv, String ValidThrough){
        this.name = name;
        this.creditCard = new CreditCard(number, cvv, ValidThrough);
    }

    public Customer(String name,CreditCard creditCard){
        this.name = name;
        this.creditCard = creditCard;
    }

    public String getCustomerName(){
        return name;
    }

    public CreditCard getCreditCard(){
        return creditCard;
    }
}
