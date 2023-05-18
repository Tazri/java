package practice;

import java.util.Scanner;

public class ArrayHighestandLowest {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter the array size : ");
        final int size = input.nextInt();

        if(size <= 0 ){
            System.out.println("> It's not possible to create array with size 0 or negative number.");
        }else{
            int []arr = new int[size];

            // get input from user
            for(int i = 0;i < size;i++){
                System.out.print("> arr["+i+"] : ");
                arr[i] = input.nextInt();
            }

            // calculate highest and lowset value from array
            int low = arr[0];
            int high = arr[0];

            for(int i = 1;i < size;i++){
                if(arr[i] < low) low = arr[i];
                if(arr[i] > high) high = arr[i];
            }

            System.out.println();
            System.out.println("> Highest Number is : "+high);
            System.out.println("> Lowest Number is : "+low);
        }

        input.close();
    }
}


/*
Sample Output : 
> Enter the array size : 4
> arr[0] : 43
> arr[1] : 56
> arr[2] : 32
> arr[3] : 346

> Highest Number is : 346
> Lowest Number is : 32
*/