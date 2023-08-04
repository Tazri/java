package books.java_programming.chapter_07.practice.practice_6_atm;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private ArrayList <Account> AccountList = new ArrayList<Account>();
    private Account logedAccount;
    private boolean isLoggedIn;
    private static Scanner input = new Scanner(System.in);

    public boolean logIn(){
        System.out.println("> Enter your user name please : ");
        String name = input.nextLine();

        System.out.println("> Enter your password please : ");
        String password = input.nextLine();

        Account selectedAccount;
        int accountIndex = -1;
        for(int i = 0;i < AccountList.size();i++){
            if(AccountList.get(i).getName().equals(name)){
                accountIndex = i;
                break;
            }
        }
        
        if(accountIndex == -1){
            System.out.println("> This name is not found in account list.");
            System.out.println("> Please create a account.");
        }else{
            selectedAccount = AccountList.get(accountIndex);

            if(!selectedAccount.checkPassword(password)){
                System.out.println("> Your password is wrong. :(");
            }else{
                this.logedAccount = selectedAccount;
                this.isLoggedIn = true;

                System.out.println("> Welcome "+selectedAccount.getName());
                System.out.println("> Your current balance : "+selectedAccount.getBalance());

                System.out.println("\n");
                this.showOption();
            }
        }
        return true;
    }

    // create account
    public boolean createAccount(){
        System.out.println("> Enter new account name : ");
        String name = input.nextLine();

        System.out.println("> Enter password : ");
        String password = input.nextLine();

        if(name.length() < 5){
            System.out.println("> Minimum length of name is 5. Please try again.");
        }else if(password.length() < 6){
            System.out.println("> Minimum length of password is 6. Please try again.");
        }else{
            // find it in the account list
            int index = -1;
            for(int i = 0;AccountList.size() < i;i++){
                if(AccountList.get(i).getName().equals(name)){
                    index = i;
                    break;
                }
            }

            if(index != -1){
                System.out.println("> '"+name+"' this name already used. Try another name.");
            }else{
                Account newAccount = new Account(name, password);
                AccountList.add(newAccount);

                System.out.println("> Thanks to create a account, now log your account with the password.");
            }
        }

        return true;
    }


    // show avaiable option
    public boolean showOption(){
        System.out.println("> Main Menu <");
        System.out.println("> 'options' Show Options");
        if(isLoggedIn){
            System.out.println("> 'check' -> Check Balance");
            System.out.println("> 'withdraw' -> Withdraw");
            System.out.println("> 'deposit' -> Depsoit");
            System.out.println("> 'exit' -> Exit");
        }else{
            System.out.println("> 'enter' -> Log in");
            System.out.println("> 'create' -> Create account");
        }
        System.out.println("> 'stop' -> Stop ATM");

        return true;
    }


    // option checking
    public boolean isOptionIsValid(String option){
        if(isLoggedIn){
            return switch(option){
                case "check","withdraw","deposit","exit","options","stop" -> true;
                default -> false;
            };
        }else{
            return switch(option){
                case "enter","create","options","stop" -> true;
                default -> false;
            };
        }
    }

    public boolean withdraw(){
        System.out.print("> Withdraw amount : ");
        int amount = input.nextInt();
        input.nextLine();

        System.out.print("> Password : ");
        String password = input.nextLine();
        

        Transision transision = this.logedAccount.widthdraw(amount, password);
        transision.showWithdrawDetails();

        return true;
    }

    public boolean deposit(){
        System.out.print("> Deposit amount : ");
        int amount = input.nextInt();
        input.nextLine();

        Transision transision = this.logedAccount.deposit(amount);
        transision.showDespositDetails();

        return true;
    }


    public boolean exit(){
        this.logedAccount = null;
        this.isLoggedIn = false;
        System.out.println("> Thanks to use our service. :)");

        return true;
    }

    public boolean check(){
        this.logedAccount.checkBalance();
        return true;
    }

    public boolean stop(){
        if(this.isLoggedIn){
            this.exit();
        }

        System.out.println("\n\n> Terminate <");

        input.close();
        return false;
    }

    public boolean runCommand(String option){
        boolean commandStatus = false;
        switch(option){
            case "enter" :
                commandStatus = this.logIn();
                break;
            case "create" : 
                commandStatus = this.createAccount();
                break;
            case "check" : 
                commandStatus = this.check();
                break;
            case "stop" : 
                commandStatus = this.stop();
                break;
            case "exit":
                commandStatus = this.exit();
                break;
            case "deposit" : 
                commandStatus = this.deposit();
                break;
            case "withdraw" : 
                commandStatus = this.withdraw();
                break;
            case "options" :
                commandStatus = this.showOption();
        }

        return commandStatus;
    }

    public void run(){
        this.showOption();
        System.out.println();

        boolean isStopCommand = false;

        while(!isStopCommand){
            System.out.print("\n> Command : ");
            String command = input.nextLine().toLowerCase();

            
            // check is valid option ?
            if(this.isOptionIsValid(command)){
                // stop command always return false
                isStopCommand = !this.runCommand(command);
            }else{
                System.out.println("\n> Your option is not valid");
            }
        }
    }

}
