package books.java_programming.chapter_02;
import java.util.Scanner;

class Sum {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int a = input.nextInt();

        System.out.println("Enter another number : ");
        int b = input.nextInt();

        int sum = a + b;

        System.out.println("Sum : "+sum);

        input.close();
    }    
}

/*
Enter a number : 
10
Enter another number : 
20
Sum : 30
*/