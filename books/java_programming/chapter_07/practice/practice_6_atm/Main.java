package books.java_programming.chapter_07.practice.practice_6_atm;

public class Main {
    public static void main(String args[]){
        ATM atm = new ATM();

        System.out.println("> ATM going to Start...");

        atm.run();
    }
}

/*
// Output of sample use : 

> ATM going to Start...
> Main Menu <
> 'options' Show Options
> 'enter' -> Log in
> 'create' -> Create account
> 'stop' -> Stop ATM


> Command : create
> Enter new account name : 
Md Tazri
> Enter password : 
thisispassword
> Thanks to create a account, now log your account with the password.

> Command : options
> Main Menu <
> 'options' Show Options
> 'enter' -> Log in
> 'create' -> Create account
> 'stop' -> Stop ATM

> Command : check

> Your option is not valid

> Command : enter 
> Enter your user name please : 
Md Tazri
> Enter your password please : 
thisispassword
> Welcome Md Tazri
> Your current balance : 100


> Main Menu <
> 'options' Show Options
> 'check' -> Check Balance
> 'withdraw' -> Withdraw
> 'deposit' -> Depsoit
> 'exit' -> Exit
> 'stop' -> Stop ATM

> Command : check
> current blance : 100

> Command : deposit
> Deposit amount : 5030200
> Transision Details <
> Account Name : Md Tazri
> Status : Successfull
> Desposit : 5030200
> Balance : 5030300
> Transition Successfull :)

> Command : withdraw 
> Withdraw amount : 3234563
> Password : thisispassword
> Transistion Details <
> Account Name : Md Tazri
> Status : Successfull
> Widtraw : 3234563
> Balance : 1795737
> Transition Successfull :)

> Command : check
> current blance : 1795737

> Command : exit
> Thanks to use our service. :)

> Command : options
> Main Menu <
> 'options' Show Options
> 'enter' -> Log in
> 'create' -> Create account
> 'stop' -> Stop ATM

> Command : create
> Enter new account name : 
Ans Anonymo
> Enter password : 
anonymopassword
> Thanks to create a account, now log your account with the password.

> Command : enter
> Enter your user name please : 
Ans Anonymo
> Enter your password please : 
anonymopassword
> Welcome Ans Anonymo
> Your current balance : 100


> Main Menu <
> 'options' Show Options
> 'check' -> Check Balance
> 'withdraw' -> Withdraw
> 'deposit' -> Depsoit
> 'exit' -> Exit
> 'stop' -> Stop ATM

> Command : check    
> current blance : 100

> Command : deposit 
> Deposit amount : 5403200
> Transision Details <
> Account Name : Ans Anonymo
> Status : Successfull
> Desposit : 5403200
> Balance : 5403300
> Transition Successfull :)

> Command : withdraw 
> Withdraw amount : 432
> Password : anonymopassword
> Transistion Details <
> Account Name : Ans Anonymo
> Status : Successfull
> Widtraw : 432
> Balance : 5402868
> Transition Successfull :)

> Command : check
> current blance : 5402868

> Command : exit
> Thanks to use our service. :)

> Command : enter 
> Enter your user name please : 
Md Tazri
> Enter your password please : 
thisispassword
> Welcome Md Tazri
> Your current balance : 1795737


> Main Menu <
> 'options' Show Options
> 'check' -> Check Balance
> 'withdraw' -> Withdraw
> 'deposit' -> Depsoit
> 'exit' -> Exit
> 'stop' -> Stop ATM

> Command : check
> current blance : 1795737

> Command : exit
> Thanks to use our service. :)

> Command : stop


> Terminate <
*/