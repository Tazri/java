package books.java_programming.chapter_03;
import java.util.Scanner;

public class EqualityExpression {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = input.nextInt();
        System.out.print("Enter another number : ");
        int b = input.nextInt();

        boolean isAGreaterThanB = a > b;
        if(isAGreaterThanB){
            System.out.println(a + " is greater than "+b);
        }

        boolean isALessThanB = a < b;
        if(isALessThanB){
            System.out.print(a + " is less than "+b);
        }

        input.close();
    }
}

/*
output : 
Enter a number : 45
Enter another number : 2
45 is greater than 2
*/
