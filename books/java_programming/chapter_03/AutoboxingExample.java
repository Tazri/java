package books.java_programming.chapter_03;
public class AutoboxingExample {
    public static Integer add(Integer a,Integer b){
        return a + b;
    }
    public static void main(String []args){
        int a = 5;
        int b = 15;

        add(a,b);// here is autoboxing
    }
}
