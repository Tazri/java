package practice;

import java.util.Scanner;

public class SubjectNumber {
    static void print(String s){
        System.out.print(s);
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        print("> Enter the number got in subject no 1 : ");
        double n1 = input.nextDouble();

        print("> Enter the number got in subject no 2 : ");
        double n2 = input.nextDouble();

        print("> Enter the number got in subject no 3 : ");
        double n3 = input.nextDouble();

        print("> Enter the number got in subject no 4 : ");
        double n4 = input.nextDouble();

        print("> Enter the number got in subject no 5 : ");
        double n5 = input.nextDouble();

        print("> Enter the number got in subject no 6 : ");
        double n6 = input.nextDouble();
        
        double totalNumber = n1 + n2 + n3 + n4 + n5 + n6;
        double average = totalNumber / 6;
        double percentage = (totalNumber/600)*100;

        print("> Total Number : " + totalNumber + "\n");
        print("> Average : " + average + "\n");
        print("> Percentage : " + percentage + "\n");

        input.close();
    }
}

/*
Output : 
> Enter the number got in subject no 1 : 78
> Enter the number got in subject no 2 : 50
> Enter the number got in subject no 3 : 98
> Enter the number got in subject no 4 : 99
> Enter the number got in subject no 5 : 97
> Enter the number got in subject no 6 : 96
> Total Number : 518.0
> Average : 86.33333333333333
> Percentage : 86.33333333333333
*/