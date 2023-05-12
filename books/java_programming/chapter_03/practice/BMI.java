package practice;

import java.util.Scanner;

public class BMI {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter your weight : ");
        double w = input.nextDouble();

        System.out.print("> Enter your height : ");
        double h = input.nextDouble();
        double bmi = w/h;

        System.out.println("> Your BMI is : "+bmi);
        input.close();
    }
}

/*
> Enter your weight : 45
> Enter your height : 2
> Your BMI is : 22.5
*/