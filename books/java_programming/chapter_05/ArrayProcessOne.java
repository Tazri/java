package books.java_programming.chapter_05;

public class ArrayProcessOne {
    public static void main(String []args){
        int [] myArray = {-45, 1, 8, 4, 5, 4, 5, 105};

        System.out.println("Index\tValue");
        for(int i = 0;i < myArray.length;i++){
            System.out.println(i+"\t"+myArray[i]);
        }
    }
}

/*
Index   Value
0       -45
1       1
2       8
3       4
4       5
5       4
6       5
7       105
*/