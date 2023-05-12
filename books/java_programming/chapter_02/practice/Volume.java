package practice;

import java.util.Scanner;

public class Volume {
    public static void main(String []args){
        int length,width,height,volume;
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter Length : ");
        length = input.nextInt();
        System.out.print("> Enter width : ");
        width = input.nextInt();
        System.out.print("> Enter height : ");
        height = input.nextInt();

        volume = length*width*height;
        
        System.out.println("> Volume = "+volume);
        input.close();
    }
}

/*
> Enter Length : 4
> Enter width : 3
> Enter height : 2
> Volume = 24

*/