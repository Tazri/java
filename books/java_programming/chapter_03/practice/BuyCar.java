package books.java_programming.chapter_03.practice;
import java.util.Scanner;

public class BuyCar {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double carPrice = 35_00_000;

        System.out.print("> Enter the money you save in month : ");
        double perMonth = input.nextDouble();
        double perDay = perMonth /30;
        int needDay = (int) (carPrice / perDay);
        int needMonth = needDay / 30;
        int leftDay = needDay - (needMonth*30);

        System.out.println("> Need "+needMonth+" month "+leftDay+" day to buy the car!!");

        input.close();
    }
}
