package practice;

import java.util.Scanner;

public class PrintFibo {
    static void printSeries(int []series){
        if(series == null){
            System.out.print("> The series is null.");
        }else{
            System.out.print("> Series : "+series[0]);

            for(int i = 1;i < series.length;i++){
                System.out.print(", "+series[i]);
            }
        }

        System.out.println();
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter the total terms of fibonacci series : ");
        int totalTerms = input.nextInt();

        if(totalTerms <= 0){
            System.out.println("> That's not possible, because you enter 0 or negative number.");
        }else{
            int []fiboTerms = new int[totalTerms];

            if(totalTerms == 1) fiboTerms[0] = 0;
            else{
                fiboTerms[0] = 0;
                fiboTerms[1] = 1;

                // calculate others terms
                for(int i = 2;i < totalTerms;i++){
                    fiboTerms[i] = fiboTerms[i-1] + fiboTerms[i-2];
                }
            }

            printSeries(fiboTerms);
        }

        input.close();
    }
}

/*
Sample Output 1: 
> Enter the total terms of fibonacci series : 7
> Series : 0, 1, 1, 2, 3, 5, 8

Sample Output 2: 
> Enter the total terms of fibonacci series : 10
> Series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

Sample Output 3 : 
> Enter the total terms of fibonacci series : -7
> That's not possible, because you enter 0 or negative number.
*/