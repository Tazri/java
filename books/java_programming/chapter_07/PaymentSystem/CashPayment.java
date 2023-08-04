package books.java_programming.chapter_07.PaymentSystem;

public class CashPayment implements Payment {
    private final double amount;

    public CashPayment(double amount){
        this.amount = amount;
    }

    @Override
    public double getAmount(){
        System.out.println("Talking cash payment");
        return amount;
    }
}
