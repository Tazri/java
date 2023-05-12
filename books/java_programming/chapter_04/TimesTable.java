import java.util.Scanner;

public class TimesTable {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        System.out.println(number+ " times table : ");

        int counter = 1;

        while(counter <= 10){
            System.out.println(number + " X " + counter + " = "+ (counter *number));

            counter++;
        }

        input.close();
    }
}

/*
Sample Output : 
Enter a number : 19
19 times table : 
19 X 1 = 19
19 X 2 = 38
19 X 3 = 57
19 X 4 = 76
19 X 5 = 95
19 X 6 = 114
19 X 7 = 133
19 X 8 = 152
19 X 9 = 171
19 X 10 = 190
*/