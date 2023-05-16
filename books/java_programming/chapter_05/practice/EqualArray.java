package practice;

import java.util.Scanner;

public class EqualArray{
    static public boolean isEqualArr(int []arrOne,int []arrTwo){
        if(arrOne == null || arrTwo == null) return false;

        if(arrOne.length != arrTwo.length) return false;

        for(int i = 0;i < arrOne.length;i++){
            if(arrOne[i] != arrTwo[i]) return false;
        }

        return true;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("> Etner the first arr size : ");
        int sizeOne = input.nextInt();

        System.out.println("> Enter the first array, arrOne : ");
        int []arrOne = new int[sizeOne];
        for(int i = 0;i < sizeOne;i++){
            System.out.print("> arrOne["+i+"] : ");
            arrOne[i] = input.nextInt();
        }

        System.out.println("\n> Enter the second arr size : ");
        int sizeTwo = input.nextInt();
        int []arrTwo = new int[sizeTwo];
        for(int i = 0;i < sizeTwo;i++){
            System.out.print("> sizeTwo["+i+"] : ");
            arrTwo[i] = input.nextInt();
        }

        System.out.println();

        if(isEqualArr(arrOne, arrTwo)){
            System.out.println("> Both array are equal.");
        }else{
            System.out.println("> Both array are not equal.");
        }

        input.close();
    }
}

/*
Sample Output 1 : 
> Etner the first arr size : 3
> Enter the first array, arrOne : 
> arrOne[0] : 5
> arrOne[1] : 6
> arrOne[2] : 7

> Enter the second arr size : 
3
> sizeTwo[0] : 5
> sizeTwo[1] : 6
> sizeTwo[2] : 7

> Both array are equal.

Sample Output 2 : 
> Etner the first arr size : 3
> Enter the first array, arrOne : 
> arrOne[0] : 1
> arrOne[1] : 3
> arrOne[2] : 2

> Enter the second arr size : 
3
> sizeTwo[0] : 3
> sizeTwo[1] : 2
> sizeTwo[2] : 1

> Both array are not equal.
*/