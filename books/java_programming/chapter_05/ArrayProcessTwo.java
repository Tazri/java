import java.util.Scanner;

public class ArrayProcessTwo {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("> Length of array : ");
        int sizeOfArray = input.nextInt();

        int [] numbers = new int[sizeOfArray];
        for(int i = 0;i < numbers.length;i++){
            System.out.print("> number["+i+"] : ");
            numbers[i] = input.nextInt();
        }

        System.out.println("Index\tValue");
        for(int i = 0;i < numbers.length;i++){
            System.out.println(i+"\t"+numbers[i]);
        }

        input.close();
    }
}

/*
> Length of array : 6
> number[0] : 6
> number[1] : 7
> number[2] : 8
> number[3] : 9
> number[4] : 0
> number[5] : 1
Index   Value
0       6
1       7
2       8
3       9
4       0
5       1
*/
