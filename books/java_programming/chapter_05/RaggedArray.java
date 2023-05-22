package books.java_programming.chapter_05;
public class RaggedArray {
    public static void main(String args[]){
        int [][]array = {
            {5, 2, 3, 4, 5},
            {3, 3, 4, 5},
            {1, 3, 5},
            {4, 5},
            {5,}
        };

        for(int row = 0;row < array.length;row++){
            for(int col = 0;col <array[row].length;col++){
                System.out.print(array[row][col]+" ");
            }

            System.out.println();
        }
    }
}

/*
Output : 
5 2 3 4 5 
3 3 4 5 
1 3 5 
4 5 
5 
*/