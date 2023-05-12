package practice;

import java.util.Scanner;

public class ExchangeRate {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter amount in BDT :  ");
        double money = input.nextDouble();

        System.out.print("> Enter exchange rate (in USD) : ");
        double usdRate = input.nextDouble();

        System.out.print("> Enter exchange rate (in CAD) : ");
        double cadRate = input.nextDouble();

        double usd = money * usdRate;
        double cad = money * cadRate;

        System.out.println("> USD : "+usd);
        System.out.println("> CAD : "+cad);

        input.close();
    }
}

/*
Output : 
> Enter amount in BDT :  100000
> Enter exchange rate (in USD) : 0.012
> Enter exchange rate (in CAD) : 0.015
> USD : 1200.0
> CAD : 1500.0
*/