package books.java_programming.chapter_03.practice;
import java.util.Scanner;

class SumDigit{
    public static void main(String args[]){
        Scanner input =  new Scanner(System.in);

        System.out.print("> Enter a number between 0 and 1000 : ");
        int n = input.nextInt();
        int num = n;
        // get first digit
        int sum = num%10;
        
        num /= 10;

        // secnond digit
        sum += num%10;
        num /= 10;

        // third digit
        sum += num % 10;
        num /= 10;

        //forth digit
        sum += num % 10;

        System.out.println("> The sum of all digits of "+n+" is : "+sum);

        input.close();
    }
}

/*
output : 
> Enter a number between 0 and 1000 : 1234
> The sum of all digits of 1234 is : 10
*/