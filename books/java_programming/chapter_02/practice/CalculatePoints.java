package books.java_programming.chapter_02.practice;
import java.util.Scanner;

public class CalculatePoints {
    public static void main(String []args){
        int wins,draws,losses,totalPoint;
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter wins : ");
        wins = input.nextInt();
        
        System.out.print("> Enter draws : ");
        draws = input.nextInt();

        System.out.print("> Enter losses : ");
        losses = input.nextInt();

        totalPoint = (wins*3) + (draws*1) + (losses * 0);
        
        System.out.println("> Total Points = " + totalPoint);

        input.close();
    }
}

/*
> Enter wins : 3
> Enter draws : 3
> Enter losses : 2
> Total Points = 12
*/