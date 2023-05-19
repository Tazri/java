package books.java_programming.chapter_06;

public class ComplexNumber {
    private final double re; // the real number
    private final double im;

    // constructor
    // this is public constructor
    // constructor name are class name must be same
    // constructor dose not return anything
    public ComplexNumber(double re, double im){
        this.re = re;
        this.im = im;
    }

    public ComplexNumber plus(ComplexNumber b){
        double real = this.re + b.re;
        double imag = this.im + b.im;
        
        return new ComplexNumber(real, imag);
    }

    public ComplexNumber minus(ComplexNumber b){
        double real = this.re - b.re;
        double imag = this.im - b.im;

        return new ComplexNumber(real, imag); // call the construtor
    }

    public String toString(){
        // if something one to print then create to toString method which 
        // called in system.out.print or system.out.println method.
        if(im == 0){
            return re + "";
        }
        if(re == 0){
            return im +"i";
        }

        if(!(im < 0)){
            return re + " + " + im + "i";
        }

        return re + " - " + (-im) + "i";
    }
}

// this class use in ./ComplexNumberDemo.java file