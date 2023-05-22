package books.java_programming.chapter_03;
public class UnboxingExample {
    public static int add(int a,int b){
        return a + b;
    }
    public static void main(String []args){
        Integer a = 5;
        Integer b = 15;
        add(a,b); // unboxing
    }
}