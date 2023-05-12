package practice;

import java.util.Scanner;
import java.lang.Math;

public class FitInCircle {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter height : ");
        double height = input.nextDouble();

        System.out.print("> Enter width : ");
        double width = input.nextDouble();

        System.out.print("> Enter radius : ");
        double radius = input.nextDouble();

        double halfDiagnal = Math.sqrt((height*height)+(width*width))/2;
    
        if(halfDiagnal <= radius){
            System.out.println("> The rectangle can fit inside the circle.");
        }else{
            System.out.println("> The rectangle can not fit inside the circle.");
        }

        input.close();
    }
}

/*
Ouput Sample : 
> Enter height : 5
> Enter width : 10
> Enter radius : 7
> The rectangle can fit inside the circle.
*/