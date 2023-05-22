package books.java_programming.chapter_02.practice;

import java.util.Scanner;

public class ConvertDegree {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter radian : ");
        double radian = input.nextDouble();
        double degree = (180/3.14169)*radian;
        System.out.println("> Degree : "+degree);

        input.close();
    }
}

/*
Output : 
> Enter radian : 3.14159265358979323846
> Degree : 179.99442263436646
*/

