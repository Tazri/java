package books.java_programming.chapter_07.PaymentSystem;

public class BkashPayment implements Payment {
    private final double amount;

    public BkashPayment(double amount){
        this.amount = amount;
    }

    @Override
    public double getAmount(){
        System.out.println("Taking Bkash payment");
        return amount;
    }
}
