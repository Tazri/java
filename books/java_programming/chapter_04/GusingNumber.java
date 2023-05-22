package books.java_programming.chapter_04;
import java.util.Scanner;

public class GusingNumber {
    public static void main(String args[]){
        int number = 15;

        Scanner input = new Scanner(System.in);

        System.out.print("Guess a number : ");

        int guess = input.nextInt();

        if(guess == number){
            System.out.println("Congrasulation! "+ "You guessed the number correctly.");
        }else if(number > guess){
            System.out.println("The number is greater than " + guess);
        }else{
            System.out.println("The number is less than "+guess);
        }

        input.close();
    }
}

/*
Output Sample 1 : 
Guess a number : 48
The number is less than 48

Output Sample 2 : 
Guess a number : 7
The number is greater than 7

Output Sample 3 : 
Guess a number : 15 
Congrasulation! You guessed the number correctly.
*/