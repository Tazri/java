package practice;

import java.util.Scanner;

public class MinMax {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("How many number do you want to enter : ");
        int totalNumber = input.nextInt();

        if(totalNumber > 0){
            System.out.print("Enter number no 1 : ");
            int number = input.nextInt();
            int min = number;
            int max = number;

            for(int i = 1;i < totalNumber;i++){
                System.out.print("Enter number no "+(i+1)+" : ");
                number = input.nextInt();
                
                if(number < min) min = number;
                if(number > max) max = number;
            }

            System.out.println("The maximum number is : "+max);
            System.out.println("The minimum number is : "+min);
        }

        input.close();
    }
}

/*
Sample Outut : 
How many number do you want to enter : 15
Enter number no 1 : 7
Enter number no 2 : 98
Enter number no 3 : 45
Enter number no 4 : -87
Enter number no 5 : 965
Enter number no 6 : 21
Enter number no 7 : 78
Enter number no 8 : -85
Enter number no 9 : 0
Enter number no 10 : 75
Enter number no 11 : 89
Enter number no 12 : 10
Enter number no 13 : 48
Enter number no 14 : 6652
Enter number no 15 : 47
The maximum number is : 6652
The minimum number is : -87
*/