package practice;

import java.util.Scanner;

public class Calculate {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double a = input.nextDouble();

        System.out.print("Enter second number : ");
        double b = input.nextDouble();

        double sum = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;

        System.out.println(""+a+" + "+b + " = "+sum);
        System.out.println(""+a+" + "+b + " = "+sub);
        System.out.println(""+a+" + "+b + " = "+mul);
        System.out.println(""+a+" + "+b + " = "+div);

        input.close();
    }
}

/*
 * output :
Enter first number : 20
Enter second number : 5
20.0 + 5.0 = 25.0
20.0 + 5.0 = 15.0
20.0 + 5.0 = 100.0
20.0 + 5.0 = 4.0

*/