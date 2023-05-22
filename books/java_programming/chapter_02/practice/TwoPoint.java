package books.java_programming.chapter_02.practice;

import java.util.Scanner;
import java.lang.Math;

public class TwoPoint {
    static void print(String s){
        System.out.print(s);
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        print("> Enter x1 : ");
        double x1 = input.nextDouble();

        print("> Enter y1 : ");
        double y1 = input.nextDouble();

        print("> Enter x2 : ");
        double x2 = input.nextDouble();

        print("> Enter y2 : ");
        double y2 = input.nextDouble();

        double diffx = x1 - x2;
        double diffy = y1 - y2;
        double powerDiffx = diffx * diffx;
        double powerDiffy = diffy * diffy;
        double distance =  Math.sqrt(powerDiffx+powerDiffy);

        System.out.println("> Distance : "+distance);

        input.close();
    }
}

/*
Output : 
> Enter x1 : 2
> Enter y1 : 4
> Enter x2 : 8
> Enter y2 : 6
> Distance : 6.324555320336759
*/