package books.java_programming.chapter_03.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ChargeOfCall {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.#");

        System.out.print("> Enter total call duration in minutes : ");
        double time = input.nextDouble();
        double bill = 125;

        if(time > 500 && time <= 1000){
            bill += (time -500) * 0.25;
        }else if(time > 1000){
            bill += 500*0.25;
            bill += (time - 1000) * 0.49;
        }

        String billStr = formatter.format(bill);

        System.out.println("> Total bill : "+ billStr);

        input.close();
    }
}

/*
Output Sample 1 : 
> Enter total call duration in minutes : 1250
> Total bill : 372.5

*/