package books.java_programming.chapter_03;
public class SwapVariable {
    public static void main(String []args){
        int x = 20;
        int y = 22;

        x = x^y;
        y = x^y;
        x = x ^ y;

        System.out.println("x = "+x); // x = 22
        System.out.println("y = "+y); // y = 20
    }
}
