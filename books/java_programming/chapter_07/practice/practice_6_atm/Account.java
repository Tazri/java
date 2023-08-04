package books.java_programming.chapter_07.practice.practice_6_atm;

public class Account {
    private String password;
    private String name;
    private int balance;
    private final int minimumAmmount = 0;
    
    public Account(){
        this.password = null;
        this.name = null;
    }

    public Account(String name,String password){
        this.password = password;
        this.name = name;
        this.balance = 100; // intial balance
    }

    public Boolean setPassword(String password){
        if(password.length() < 6){
            return false;
        }
        
        this.password = password;
        return true;
    }

    public boolean checkPassword(String password){
        return this.password.equals(password);
    }

    public boolean setName(String name,String password){
        if(checkPassword(password)){
            this.name = name;
            return true;
        }

        return false;
    }


    public String getName(){
        return this.name;
    }

    
    public int getBalance(){
        return this.balance;
    }

    public void checkBalance(){
        System.out.println("> current blance : "+this.balance);
    }

    public Transision widthdraw(int withdrawAmount,String password){
        Transision transition = new Transision(getName(),getBalance());


        if(!checkPassword(password)){
            transition.status = false;
            transition.statusReason = "You Enter the wrong password :(";
        }
        else if(withdrawAmount < minimumAmmount){
            transition.status = false;
            transition.statusReason = "Your withdraw amount is "+withdrawAmount + " which is less than minimum amount for withdraw. If you want to withdraw then must be withraw minimum "+minimumAmmount+".";
        }
        else if(withdrawAmount > balance){
            transition.status = false;
            transition.statusReason = "Your withdraw ammount is greater then "+minimumAmmount+".";
        }else{
            this.balance -= withdrawAmount;
            transition.widthdraw = withdrawAmount;
            transition.status = true;
            transition.balance = this.balance;
            transition.statusReason = "Transition Successfull :)";
        }

        return transition;
    }

    public Transision deposit(int depositAmount){
        Transision transision = new Transision(name, depositAmount);


        if(depositAmount <= 0){
            transision.status = false;
            transision.statusReason = "You enter negative number or zero, which is not allowed to deposit. Please enter something positive.";
        }else{
            this.balance += depositAmount;
            transision.status = true;
            transision.deposit = depositAmount;
            transision.balance = getBalance();
            transision.statusReason = "Transition Successfull :)";
        }
        

        return transision;
    }
}
