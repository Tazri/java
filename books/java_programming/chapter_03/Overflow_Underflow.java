package books.java_programming.chapter_03;
public class Overflow_Underflow {
    public static void main(String []args){
        int maxInteger = Integer.MAX_VALUE;
        int mintInteger = Integer.MIN_VALUE;

        System.out.println("maxInteger : "+maxInteger); // maxInteger : 2147483647
        System.out.println("minInteger : "+mintInteger); // minInteger : -214748364

        maxInteger += 1;
        mintInteger -= 1;
        System.out.println("After maxInteger += 1 and minInteger -= 1 : ");

        System.out.println("maxInteger : "+maxInteger); // maxInteger : -2147483648
        System.out.println("minInteger : "+mintInteger); // minInteger : 2147483647

        double minDouble = Double.MIN_VALUE; // minDouble = 4.9E-324
        double maxDouble = Double.MAX_VALUE; // maxDouble = 1.7976931348623157E308

        System.out.println("\nminDouble = "+minDouble);
        System.out.println("maxDouble = "+maxDouble);

        minDouble /= 2;
        maxDouble *= 2;
        System.out.println("After minDouble /= 2 and maxDouble *= 2 : ");
        System.out.println("minDouble = "+minDouble); // minDouble = 0.0
        System.out.println("maxDouble = "+maxDouble); // maxDouble = Infinity
    }
}
