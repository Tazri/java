package practice;

import java.util.Scanner;

public class AreaTriangle {
    static void print(String s){
        System.out.print(s);
    }

    static void println(String s){
        System.out.println(s);
    }

    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        println("> Enter the first point : ");
        print("> ax : ");
        double ax = input.nextDouble();
        print("> ay : ");
        double ay = input.nextDouble();

        println("> Enter the second point : ");
        print("> bx : ");
        double bx = input.nextDouble();
        print("> by : ");
        double by = input.nextDouble();

        println("> Enter the first point : ");
        print("> cx : ");
        double cx = input.nextDouble();
        print("> cy : ");
        double cy = input.nextDouble();

        double area = 0.5*((ax*(by-cy))+(bx*(cy-ay))+(cx*(ay-by)));
        
        area = area < 0 ? -area : area;
        println("\n> The area is : "+area);

        input.close();
    }
}

/*
output : 
> Enter the first point : 
> ax : 5
> ay : 7
> Enter the second point : 
> bx : 8
> by : 6
> Enter the first point : 
> cx : 1
> cy : 2

>The area is : 9.5
*/