package books.java_programming.chapter_04;
import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an operator : +, -, *, or / : ");

        char operator = input.next().charAt(0);

        System.out.print("Enter first number : ");
        int number1 = input.nextInt();

        System.out.print("Enter second number : ");
        int number2 = input.nextInt();

        int result = switch(operator){
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            case '/' -> number1 / number2;
            default -> {
                System.out.println("Invalid operator!");
                yield 0;
            }
        };

        System.out.println("Result : "+result);

        input.close();
    }
}

/*
Output Sample 1 : 
Choose an operator : +, -, *, or / : 
+
Enter first number : 23
Enter second number : 12
Result : 35
*/