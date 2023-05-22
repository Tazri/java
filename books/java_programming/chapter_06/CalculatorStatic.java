package books.java_programming.chapter_06;

public class CalculatorStatic {
    // non static method
    public static int add(int a,int b){
        return a + b;
    }


    // call non static method
    public static void main(String args[]){
        int result = CalculatorStatic.add(3,4);
        System.out.println("> Result : "+result);
    }
}
