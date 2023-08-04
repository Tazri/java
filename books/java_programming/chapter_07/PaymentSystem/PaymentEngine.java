package books.java_programming.chapter_07.PaymentSystem;

public class PaymentEngine {
    public void accept(Payment payment){
        System.out.println("Accepting payment : "+payment.getAmount());
    }
}
