package books.java_programming.chapter_06;

import java.util.Arrays;
import java.util.StringJoiner;

public class CharStack {
    private char []elements;
    private int count;

    public CharStack(){
        // let's assume initial capacity is 10
        elements = new char[10];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public CharStack push(char c){
        if(isFull()){
            grow();
        }
        elements[count] = c;
        count ++;
        return this;
    }

    private boolean isFull(){
        return elements.length == count;
    }

    private void grow(){
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public char pop(){
        --count;
        return elements[count];
    }

    public int size(){
        return count;
    }

    public void prnitElements(){
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for(int i = 0;i < count;i++){
            joiner.add(String.valueOf(elements[i]));
        }
        System.out.println(joiner);
    }

    public static void main(String []args){
        CharStack stack = new CharStack();

        stack.push('a').push('b').push('c');
        stack.prnitElements();

        stack.pop();
        stack.pop();
        stack.prnitElements();
        
    }
}

/*
Output :
[a, b, c]
[a]
*/


/*
 * this class also use in ./BracketBalanceChecker.java file
 */