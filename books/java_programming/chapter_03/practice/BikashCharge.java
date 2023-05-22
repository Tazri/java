package books.java_programming.chapter_03.practice;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BikashCharge {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter your amount : ");
        double money = input.nextDouble();
        
        double charge = money * 0.0185;

        // formater
        DecimalFormat formater = new DecimalFormat("৳ #.##");
        String formatAmount = formater.format(charge);

        System.out.println("> Charge = "+formatAmount);

        input.close();
    }
}

/*
Output : 
> Enter your amount : 10500
> Charge = ৳ 194.25
*/