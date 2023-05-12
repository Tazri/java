import java.util.Scanner;

class WeekDaysAndWeekends{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day between (1 to 7) : ");
        int day = input.nextInt();

        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekends");
        }

        input.close();
    }
}

/*
Output Sample 1 
Enter a day between (1 to 7) :  
5
Weekdays

Output Sample 2 : 
Enter a day between (1 to 7) : 
7
Weekends
*/