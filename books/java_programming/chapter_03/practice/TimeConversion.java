package books.java_programming.chapter_03.practice;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter seconds : ");
        int seconds = input.nextInt();
        int minutes =  seconds / 60;
        seconds -=  minutes*60;

        int hours = minutes / 60;
        minutes -= hours*60;

        System.out.println("> "+hours+" hour(s) "+minutes+" minute(s) "+seconds+" secound(s)");

        input.close();
    }
}

/*
Output Sample : 
> Enter seconds : 3223111
> 895 hour(s) 18 minute(s) 31 secound(s)
*/