package practice;

import java.util.Scanner;

public class IsTrianlge {
    static void print(String s){
        System.out.print(s);
    }
    static void println(String s){
        System.out.println(s);
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        print("> Enter the first side : ");
        int a = input.nextInt();

        print("> Enter the second side : ");
        int b = input.nextInt();

        print("> Enter the third side : ");
        int c = input.nextInt();

        if((a+b) > c && (b+c) > a && (a+c) > b){
            println("> The triangle is possible.");
        }else{
            println("> The triangle is not possible.");
        }

        input.close();
    }
}

/*
Sample output  1 : 
> Enter the first side : 1
> Enter the second side : 2
> Enter the third side : 6
> The triangle is not possible.

Sample output 2 : 
> Enter the first side : 5
> Enter the second side : 4
> Enter the third side : 5
> The triangle is possible.
*/