package books.java_programming.chapter_07.ExampleAccount;

public class SavinsAccount extends CheckingAccount {
    public final int MAX_WIDTHDRAWAL = 5;

    private final double interestRate;
    private int withdrawalCount;

    public SavinsAccount(int initialBalance,String accountNumber,double interestRate){
        super(initialBalance,accountNumber);
        this.interestRate = interestRate;
    }

    public double calculateInterest(){
        return getBalance()*interestRate/ 100;
    }

    // overload the withdraw method
    @Override
    public void withdraw(int amount){
        if(withdrawalCount == MAX_WIDTHDRAWAL){
            System.out.println("> Widthdrawal limit exceed.");
        }else{
            super.withdraw(amount);
            withdrawalCount++;
        }
    }
}
