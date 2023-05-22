package books.java_programming.chapter_03.practice;

import java.util.Scanner;

public class LastDigit {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter the number : ");
        int number = input.nextInt();
        int lastDigit = number%10;

        System.out.println("> The last digit is : "+lastDigit);

        input.close();
    }
}

/*
Output Sample 1 : 
> Enter the number : 45
> The last digit is : 5

Output Sample 2 : 
> Enter the number : 1250
> The last digit is : 0
*/