package books.java_programming.chapter_05;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixCaculator{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int [][] matrixOne = new int[3][3];
        int [][] matrixTwo = new int[3][3];

        System.out.println("> Enter matrix 1 : ");
        for(int row = 0;row < matrixOne.length;row++){
            for(int col = 0;col < matrixOne[row].length;col++){
                System.out.printf("> matrixOne[%d][%d]: ",row,col);
                matrixOne[row][col] = input.nextInt();
            }
        }

        System.out.println("> Enter matrix 2 : ");
        for(int row = 0;row < matrixTwo.length;row++){
            for(int col = 0;col < matrixTwo[row].length;col++){
                System.out.printf("> matrixTwo[%d][%d]: ",row,col);
                matrixTwo[row][col] = input.nextInt();
            }
        }


        // matrix sum
        int [][] sum = new int[3][3];
        for(int row = 0;row < sum.length;row++){
            for(int col = 0;col < sum[row].length;col++){
                sum[row][col] = matrixOne[row][col] + matrixTwo[row][col];
            }
        }

        // matrix subtraction
        int [][] subtraction = new int[3][3];
        for(int row = 0;row < subtraction.length;row++){
            for(int col = 0;col < subtraction[row].length;col++){
                subtraction[row][col] = matrixOne[row][col] - matrixTwo[row][col];
            }
        }

        // matrix product
        int [][] product = new int[3][3];
        for(int row = 0; row < product.length;row++){
            for(int col = 0;col < product[row].length;col++){
                product[row][col] = matrixOne[row][col] * matrixTwo[row][col];
            }
        }

        // print sum
        System.out.println("> Sum : ");
        for(int[] row:sum){
            System.out.println(Arrays.toString(row));
        }

        // print subtraction
        System.out.println("> Subtraction : ");
        for(int[] row:subtraction){
            System.out.println(Arrays.toString(row));
        }

        // print product
        System.out.println("> Product : ");
        for(int[] row : product){
            System.out.println(Arrays.toString(row));
        }

        input.close();
    }
}

/*
Output : 
> Enter matrix 1 : 
> matrixOne[0][0]: 5
> matrixOne[0][1]: 6
> matrixOne[0][2]: 7
> matrixOne[1][0]: 5
> matrixOne[1][1]: 6
> matrixOne[1][2]: 7
> matrixOne[2][0]: 3
> matrixOne[2][1]: 4
> matrixOne[2][2]: 5
> Enter matrix 2 : 
> matrixTwo[0][0]: 1
> matrixTwo[0][1]: 2
> matrixTwo[0][2]: 1
> matrixTwo[1][0]: 2
> matrixTwo[1][1]: 1
> matrixTwo[1][2]: 2
> matrixTwo[2][0]: 1
> matrixTwo[2][1]: 2
> matrixTwo[2][2]: 1
> Sum : 
[6, 8, 8]
[7, 7, 9]
[4, 6, 6]
> Subtraction : 
[4, 4, 6]
[3, 5, 5]
[2, 2, 4]
> Product : 
[5, 12, 7]
[10, 6, 14]
[3, 8, 5]
*/