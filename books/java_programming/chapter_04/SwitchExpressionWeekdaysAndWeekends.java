import java.util.Scanner;

public class SwitchExpressionWeekdaysAndWeekends {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day between (1 to 7) : ");
        int day = input.nextInt();

        String result =  switch(day){
            case 1,2,3,4,5 -> "Weekdays";
            case 6,7 -> "Weekends";
            default -> "Unexpected Value : " + day;
        };

        System.out.println("result : "+result);

        input.close();
    }
}



/*
Sample Output 1 : 
Enter a day between (1 to 7) : 
1
result : Weekdays

Sample Output 2 : 
Enter a day between (1 to 7) : 
6
result : Weekends

Sample Output 3 : 
Enter a day between (1 to 7) : 
45
result : Unexpected Value : 45
*/