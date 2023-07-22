package problem_solving.leetcode;

import java.util.Scanner;

public class Factorial_trailing_zero{
    public int trailingZeroes(int n){
        int result = 0;

        for(int i = 1; i <= n;i++){
            int j = i;
            while(j % 5 == 0){
                result++;
                j /= 5;
            }
        }
        return result;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        Factorial_trailing_zero ob = new Factorial_trailing_zero();

        int result = ob.trailingZeroes(number);

        System.out.println(result);

        input.close();
    }
}