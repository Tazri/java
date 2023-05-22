package books.java_programming.chapter_05;
public class TwoDimensionalArray {
    public static void main(String args[]){
        // A 12x8 grid, in [row][col]
        int [][] array = new int[12][8];

        for(int row = 0;row < array.length;row++){
            for(int col = 0;col < array[row].length;col++){
                array[row][col] = row*col + 1;
            }
        }

        // print array
        for(int row = 0;row < array.length;row++){
            for(int col = 0;col <array[row].length;col++){
                System.out.printf("%3d",array[row][col]);
            }

            System.out.println();
        }
    }
}

/*
Output : 
  1  1  1  1  1  1  1  1
  1  2  3  4  5  6  7  8
  1  3  5  7  9 11 13 15
  1  4  7 10 13 16 19 22
  1  5  9 13 17 21 25 29
  1  6 11 16 21 26 31 36
  1  7 13 19 25 31 37 43
  1  8 15 22 29 36 43 50
  1  9 17 25 33 41 49 57
  1 10 19 28 37 46 55 64
  1 11 21 31 41 51 61 71
  1 12 23 34 45 56 67 78
*/