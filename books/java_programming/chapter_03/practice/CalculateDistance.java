package books.java_programming.chapter_03.practice;

import java.util.Scanner;

public class CalculateDistance {
    static void print(String s){
        System.out.print(s);
    }

    static void println(String s){
        System.out.println(s);
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        print("> Enter distance in meters : ");
        double distance = input.nextDouble();
        distance /= 1000;
        
        print("> Enter time taken in minutes : ");
        double time = input.nextDouble();
        time /= 60;

        double speed = distance/time;

        println("> Speen in km/h is : "+speed);
        input.close();
    }
}

/*
Sample output : 
> Enter distance in meters : 5000
> Enter time taken in minutes : 80
> Speen in km/h is : 3.75
*/