package books.java_programming.chapter_05.practice;

import java.util.Scanner;

public class FindTwoSum {
    static int [] figureOutTwoSum(int []arr,int n){
        if(arr == null) return null;

        int pair[] = new int[2];
        boolean isFound = false;

        for(int i = 0;i < arr.length;i++){
            for(int j = i+1;j < arr.length;j++){
                if(i == j) continue;

                if(arr[i] > n || arr[j] > n) continue;
                // if find the two numbers
                else if(arr[i] + arr[j] == n){
                    pair[0] = arr[i];
                    pair[1] = arr[j];
                    isFound = true;
                    break;
                }
            }

            if(isFound) break;
        }


        if(isFound) return pair;
        return null;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("> Total numbers : ");
        int totalNums = input.nextInt();

        if(totalNums <= 0){
            System.out.println("> You enter 0 or negative number.It is not possible to create arr. Please enter positive number.");
        }else{
            // get array input
            int []arr = new int[totalNums];

            for(int i = 0;i < totalNums;i++){
                System.out.print("> arr["+i+"] : ");
                arr[i] = input.nextInt();
            }

            // get the sum
            System.out.print("> get the sum, n : ");
            int n = input.nextInt();

            int pair[] = figureOutTwoSum(arr, n);

            if(pair == null){
                System.out.println("> The sum is not possible.");
            }else{
                System.out.println("> "+pair[0]+" + "+pair[1]+" = "+n);
            }
        }

        input.close();
    }
}

/*
Output : 
> Total numbers : 8
> arr[0] : 1
> arr[1] : 21
> arr[2] : 3
> arr[3] : 14
> arr[4] : 5
> arr[5] : 60
> arr[6] : 7
> arr[7] : 6
> get the sum, n : 27
> 21 + 6 = 27
*/