package books.java_programming.chapter_03.practice;

import java.text.DecimalFormat;

public class DecimalFormatExample {
    public static void main(String args[]){
        DecimalFormat decimalFormat = new DecimalFormat("৳#.##");
        double amount = 15_000.12560;
        String formattedAmount = decimalFormat.format(amount);

        System.out.println(formattedAmount);
    }
}


/*
৳15000.13
*/