package books.java_programming.chapter_05;

import java.util.Scanner;

public class AverageMinAndMaxCalculator {
    public  static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("> Length of array : ");
        int sizeOfArray = input.nextInt();


        int []numbers = new int[sizeOfArray];
        
        for(int i = 0;i < numbers.length;i++){
            System.out.print("> numbers["+i+"] : ");
            numbers[i] = input.nextInt();
        }

        int sum = 0;
        for(int i = 0;i < numbers.length;i++) sum += numbers[i];

        double average = (double) sum / numbers.length;

        int min = numbers[0];
        int max = numbers[0];

        for(int i = 1;i < numbers.length;i++){
            if(numbers[i] < min) numbers[i] = min;
            if(numbers[i] > max) numbers[i] = max;
        }

        System.out.println("> Sum : "+sum);
        System.out.println("> Average : "+average);
        System.out.println("> Minimum : "+min);
        System.out.println("> Maximum : "+max);

        input.close();
    }
}

/*
Output : 
> Length of array : 10
> numbers[0] : 8
> numbers[1] : 79
> numbers[2] : 52
> numbers[3] : 4
> numbers[4] : 28
> numbers[5] : -98
> numbers[6] : 45
> numbers[7] : 2
> numbers[8] : 47
> numbers[9] : 8
> Sum : 175
> Average : 17.5
> Minimum : 8
> Maximum : 8
*/