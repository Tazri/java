package books.java_programming.chapter_04;
import java.util.Scanner;

public class GussingGame {
    public static void main(String args[]){
        int number = 15;

        Scanner input = new Scanner(System.in);

        int guess;
        do{
            System.out.print("Guess a number : ");
            guess = input.nextInt();

            if(guess == number){
                System.out.println("Congratulation! "+ "You guessed the number.");
            }else if(number > guess){
                System.out.println("The number is greater than "+guess);
            }else{
                System.out.println("The number is less than " + guess);
            }
        }while(guess != number);

        input.close();
    }
}

/*
Output : 
Guess a number : 47
The number is less than 47
Guess a number : 8
The number is greater than 8
Guess a number : 16
The number is less than 16
Guess a number : 15
Congratulation! You guessed the number.
*/