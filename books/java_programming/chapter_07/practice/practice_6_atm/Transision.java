package books.java_programming.chapter_07.practice.practice_6_atm;

public class Transision {
    public String accountName;
    public boolean status;
    public int widthdraw = 0;
    public int deposit = 0;
    public int balance;
    public String statusReason;

    public Transision(String name,int balance){
        this.accountName = name;
        this.balance = balance;
    }

    public void showWithdrawDetails(){
        System.out.println("> Transistion Details <");
        System.out.println("> Account Name : "+accountName);
        System.out.println("> Status : "+(status ? "Successfull" : "Failed"));
        System.out.println("> Widtraw : "+widthdraw);
        System.out.println("> Balance : "+balance);
        System.out.println("> "+statusReason);
    }

    public void showDespositDetails(){
        System.out.println("> Transision Details <");
        System.out.println("> Account Name : "+accountName);
        System.out.println("> Status : "+(status ? "Successfull" : "Failed"));
        System.out.println("> Desposit : "+deposit);
        System.out.println("> Balance : "+balance);
        System.out.println("> "+statusReason);
    }
}
