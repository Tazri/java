import java.util.Scanner;

public class VoterEligiblityCheckerWithElse {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you ? ");
        int age = input.nextInt();

        if(age <= 18)
            System.out.println("Sorry! You are not eligible to vote." + "Better luck next time.");
        else 
            System.out.println("Congratulation! "+"You are eligible to vote.");

        input.close();
    }
}


/*
> Output Sample 1 : 
How old are you ? 
16
Sorry! You are not eligible to vote.Better luck next time.

> Output Sample 2 : 
How old are you ? 
19
Congratulation! You are eligible to vote.
*/