package books.java_programming.chapter_06;

public class ComplexNumberDemo {
    public static void main(String [] args){
        ComplexNumber a = new ComplexNumber(5.0, 6.0);
        ComplexNumber b = new ComplexNumber(-3.0,4.0);

        System.out.println("a             = "+a);
        System.out.println("b             = "+b);
        System.out.println("b + a         = "+b.plus(a));
        System.out.println("a - b         = "+a.minus(b));
    }
}

/*
Output : 
a             = 5.0 + 6.0i
b             = -3.0 + 4.0i
b + a         = 2.0 + 10.0i
a - b         = 8.0 + 2.0i

*/