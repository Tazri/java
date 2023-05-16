package practice;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveOdd {
    static public int []removeOddNumber(int []arr){
        if(arr == null) return null;
        
        int []result = new int[arr.length];

        int size = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] % 2 == 0){
                result[size++] = arr[i];
            }
        }

        result = Arrays.copyOf(result, size);
        return result;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter total element of array : ");
        int totalItem = input.nextInt();
        
        if(totalItem <= 0){
            System.out.println("> You enter 0 or negative number. Did not enter positive number.");
        }else{
            int []arr = new int[totalItem];

            // get input
            for(int i = 0;i < totalItem;i++){
                System.out.print("> arr["+i+"] : ");
                arr[i] = input.nextInt();
            }

            System.out.println("\n> Before removing odd number :");
            System.out.println(Arrays.toString(arr));
            System.out.println();

            arr = removeOddNumber(arr);

            System.out.println("> After removing odd number : ");
            System.out.println(Arrays.toString(arr));
        }

        input.close();
    }
}
