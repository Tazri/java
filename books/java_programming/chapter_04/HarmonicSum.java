package books.java_programming.chapter_04;
public class HarmonicSum {
    public static void main(String args[]){
        int n = 5000;
        double sum = 0.0;

        for(int i = 1;i <= n;i++){
            sum += 1.0 / i;
        }

        System.out.println("Sum = "+sum);
    }
}

/*
Sum = 9.094508852984404
*/