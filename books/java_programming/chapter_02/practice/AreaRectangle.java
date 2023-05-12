package practice;
import java.util.Scanner;

public class AreaRectangle {
    static void print(String s){
        System.out.print(s);
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        print("> width : ");
        int width = input.nextInt();
        print("> height : ");
        int height = input.nextInt();
        int area = width*height;
        int perimeter = 2*(width+height);
        System.out.println("> area : " + area);
        System.out.println("> perimeter : "+perimeter);
        input.close();
    }
}

/*
output : 
> width : 20
> height : 50
> area : 1000
> perimeter : 140
*/