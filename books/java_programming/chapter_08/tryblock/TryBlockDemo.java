package books.java_programming.chapter_08.tryblock;

public class TryBlockDemo {
    public static int divide(int a,int b){
        return a/b;
    }
    
    public static void main(String args[]){
        int a = 1;
        int b = 0;

        int result = 0;

        try{
            result = divide(a,b); // 1;
        }catch(ArithmeticException e){
            System.out.println("You cannot divide "+a+" by "+b);
        }

        System.out.println("result = "+result);
    }    
}

/*
 * Output : 
You cannot divide 1 by 0
result = 0

*/
