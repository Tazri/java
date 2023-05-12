import java.util.Scanner;

public class ComputeArea {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of a circle : ");
        double radius = input.nextDouble();

        double area = radius * radius * 3.14159;

        System.out.println("Area : "+ area);

        input.close(); // this is good practice and safe
    }
}


/*
Output : 
Enter the radius of a circle : 5
Area : 78.53975
*/