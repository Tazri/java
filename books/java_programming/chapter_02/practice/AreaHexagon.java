package practice;

import java.util.Scanner;

public class AreaHexagon {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter the side : ");
        double side = input.nextDouble();
        double area = 2.59807621135*side*side;
        System.out.println("> area : "+area);

        input.close();
    }
}

/*
Output : 
> Enter the side : 5
> area : 64.95190528375
*/