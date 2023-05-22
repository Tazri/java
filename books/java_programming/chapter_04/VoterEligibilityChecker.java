package books.java_programming.chapter_04;
import java.util.Scanner;

class VoterEligibilityChecker{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("How old are you? ");

        int age = input.nextInt();

        if(age >= 18){
            System.out.println("Congratulations! "+"You're eligible to vote.");
        }

        input.close();
    }
}

/*
How old are you? 
19
Congratulations! You're eligible to vote.
*/