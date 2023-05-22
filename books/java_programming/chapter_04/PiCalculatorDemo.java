package books.java_programming.chapter_04;
class Picalculator {
    public double calculate (int nterms){
        double numerator = 4.0;
        double denominator = 1.0;
        double sign = 1.0;

        double pi = 0.0;

        for(int i = 0;i < nterms;i++){
            pi += sign * (numerator/denominator);
            denominator += 2.0;
            sign *= -1.0;
        }

        return pi;
    }
}

public class PiCalculatorDemo{
    public static void main(String[]args){
        Picalculator piCalculator = new Picalculator();
        var pi = piCalculator.calculate(10_00_00_000);
        System.out.println("pi = "+pi);
    }
}


/*
Output : 
pi = 3.141592643589326
*/