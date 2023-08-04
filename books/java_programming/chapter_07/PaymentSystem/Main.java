package books.java_programming.chapter_07.PaymentSystem;

public class Main {
    public static void main(String args[]){
        PaymentEngine paymentEngine = new PaymentEngine();

        BkashPayment bkashPayment = new BkashPayment(100);
        CashPayment cashPayment = new CashPayment(345);
        
        paymentEngine.accept(bkashPayment);
        paymentEngine.accept(cashPayment);
    }
}
