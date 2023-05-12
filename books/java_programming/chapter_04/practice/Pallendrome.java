package practice;

import java.util.Scanner;

public class Pallendrome {
    public static int reverseInt(int number){
        int reverseNum = 0;
        int num = number;

        while(num != 0){
            int remainder = num % 10;
            reverseNum *= 10;
            reverseNum += remainder;
            num /= 10;
        }

        return reverseNum;
    }

    public static boolean isPalindrome(int number){
        int reverse = reverseInt(number);

        return reverse == number;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter starting number : ");
        int start = input.nextInt();

        System.out.print("> Enter ending number : ");
        int end = input.nextInt();

        System.out.println("> Palindrome number between "+start + " and "+end+" are : ");
        for(int i = start;i <= end;i++){
            if(isPalindrome(i)){
                System.out.print(i + "  ");
            }
        }
        System.out.println();
        input.close();
    }
}

/*
Output : 
> Enter starting number : 0
> Enter ending number : 125
> Palindrome number between 0 and 125 are : 
0  1  2  3  4  5  6  7  8  9  11  22  33  44  55  66  77  88  99  101  111  121  
*/