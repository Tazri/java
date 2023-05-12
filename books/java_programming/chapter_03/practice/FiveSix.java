package practice;

import java.util.Scanner;

public class FiveSix {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter the number : ");
        int number = input.nextInt();

        if(number % 5 == 0){
            System.out.println("> "+number+" is divisible by 5.");
        }else{
            System.out.println("> "+number +" is not divisible by 5.");
        }

        if(number % 6 == 0){
            System.out.println("> "+number+"is divisible by 6.");
        }else{
            System.out.println("> "+number+" is not divisible by 6.");
        }

        input.close();
    }
}


/*
Output Sample 1 : 
> Enter the number : 1585
> 1585 is divisible by 5.
> 1585 is not divisible by 6.

Output Sample 2 : 
> Enter the number : 1536
> 1536 is not divisible by 5.
> 1536is divisible by 6.
*/