package books.java_programming.chapter_03.practice;

import java.util.Scanner;

public class AllAreEqual {
    static public void print(String s){
        System.out.print(s);
    }

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int a,b,c,d;

        print("> Enter 1st number : ");
        a = input.nextInt();

        print("> Enter 2nd number : ");
        b = input.nextInt();

        print("> Enter 3rd number : ");
        c = input.nextInt();

        print("> Enter 4th number : ");
        d = input.nextInt();

        if(a == b && a == c && a == d){
            print("> All number are equal.\n");
        }else{
            print("> All number are not equal.\n");
        }
    
        input.close();
    }
}


/*
Sample output 1 : 
> Enter 1st number : 5
> Enter 2nd number : 7
> Enter 3rd number : 5
> Enter 4th number : 5
> All number are not equal.

Same output 2 : 
> Enter 1st number : 1
> Enter 2nd number : 1
> Enter 3rd number : 1
> Enter 4th number : 1
> All number are equal.
*/