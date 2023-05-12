package practice;

import java.util.Scanner;

public class Average {
    public static void print(String s){
        System.out.print(s);
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        double n = 0;
        
        print("> Enter 1st number : ");
        n += input.nextDouble();

        print("> Enter 2nd number : ");
        n += input.nextDouble();

        print("> Enter 3rd number : ");
        n += input.nextDouble();

        print("> Enter 4th number : ");
        n += input.nextDouble();

        print("> Average : "+(n/4)+"\n");

        input.close();
    }
}

/*
Output : 
> Enter 1st number : 5
> Enter 2nd number : 8
> Enter 3rd number : 1
> Enter 4th number : 2
> Average : 4.0
*/