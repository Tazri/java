package books.java_programming.chapter_05.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayUser {
    static void printArray(int []arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter how many number you enter : ");
        int totalNumbers = input.nextInt();

        if(totalNumbers <= 0){
            System.out.println("> You enter 0 or negative number.Did not enter the positive number.");
        }else{
            int arr[] = new int[totalNumbers];

            // get input
            for(int i = 0;i < totalNumbers;i++){
                System.out.print("> arr["+i+"] : ");
                arr[i] = input.nextInt();
            }

            System.out.println("> Before sorting : ");
            printArray(arr);

            System.out.println("\n> After sorting : ");

            for(int i = 0;i < totalNumbers;i++){
                int select = i;
                for(int j = i+1;j < totalNumbers;j++){
                    if(arr[j] < arr[select]) select = j;
                }

                // swap
                int temp = arr[select];
                arr[select] = arr[i];
                arr[i] = temp;
            }

            printArray(arr);
        }

        input.close();
    }
}

/*
Output 1 : 
> Enter how many number you enter : 5
> arr[0] : 8
> arr[1] : -7
> arr[2] : 9
> arr[3] : 6
> arr[4] : 2
> Before sorting : 
[8, -7, 9, 6, 2]

> After sorting : 
[-7, 2, 6, 8, 9]
*/