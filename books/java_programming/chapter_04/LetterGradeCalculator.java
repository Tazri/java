package books.java_programming.chapter_04;
import java.util.Scanner;

public class LetterGradeCalculator {
    public static void main(String args[]){
        System.out.println("Enter Score : ");

        Scanner input = new Scanner(System.in);

        int score = input.nextInt();

        if(score >= 80) System.out.println("A+");
        else if(score >= 70) System.out.println("A");
        else if(score >= 60) System.out.println("A-");
        else if(score >= 50) System.out.println("B");
        else if(score >= 40) System.out.println("C");
        else if(score >= 33) System.out.println("D");
        else System.out.println("F");

        input.close();
    }
}

/*
Output Sample 1 : 
Enter Score : 
87
A+
*/