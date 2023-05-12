import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        long n = input.nextLong();

        System.out.print("Prime factors of "+n+" are : ");

        // no factors would exist beyond
        // (n/i) for a particular factor
        for(long i = 2;i < (n/i);i++){
            while(n%i == 0){
                // if i is a factor
                System.out.print(i + " ");
                // divide n by i, else we won't get a prime number
                n = n / i;
            }
        }

        if(n > 1){
            System.out.println(n);
        }

        input.close();
    }
}

/*
Output : 
Enter a number : 225
Prime factors of 225 are : 3 3 25
*/