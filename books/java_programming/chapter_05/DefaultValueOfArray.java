package books.java_programming.chapter_05;
import java.util.Arrays;

public class DefaultValueOfArray {
    public static void main(String args[]){
        int [] ints = new int[5];

        System.out.println("> ints : "+Arrays.toString(ints));

        Integer[] integers = new Integer[5];
        System.out.println("> intgers : "+ Arrays.toString(integers));

        float [] floats = new float[5];
        System.out.println("> floats : "+Arrays.toString(floats));
    }
}

/*
> ints : [0, 0, 0, 0, 0]
> intgers : [null, null, null, null, null]
> floats : [0.0, 0.0, 0.0, 0.0, 0.0]
*/