package books.java_programming.chapter_05.practice;

import java.util.Scanner;

public class CountriesQuiz{
    static final String countries[][] = new String[][]{
        {
            "Bangladesh",
            "Dhaka",
            "Taka",
            "Bangla"
        },
        {
            "India",
            "Delhi",
            "Rupee",
            "Hindi"
        }
    };

    final static String topics[] = {
        "capital",
        "currency",
        "offical language"
    };

    public static void println(String s){
        System.out.println(s);
    }

    public static void print(String s){
        System.out.print(s);
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        // start to asking
        int correct = 0;
        int wrong = 0;
        for(int set = 0;set < countries.length;set++){
            for(int q = 1;q <= 3;q++){
                println("Q: What is the "+topics[q-1]+" of " + countries[set][0]+"?");

                print("Ans : ");
                String ans = input.next();
                
                if(ans.toLowerCase().equals(countries[set][q].toLowerCase())){
                    println("✔️ Well done!");
                    correct++;
                }else{
                    println("❌ The correct answer should be "+countries[set][q]+'.');
                    wrong++;
                }
            }
        }

        println("");

        println("Total correct answer : "+correct);
        println("Total wrong answer : "+wrong);

        input.close();
    }
}

/*
Sample Output : 
Q: What is the capital of Bangladesh?
Ans : Dhaka
?? Well done!
Q: What is the currency of Bangladesh?
Ans : Rupee
? The correct answer should be Taka.
Q: What is the offical language of Bangladesh?
Ans : Bangla
?? Well done!
Q: What is the capital of India?
Ans : Delhi
?? Well done!
Q: What is the currency of India?
Ans : Taka
? The correct answer should be Rupee.
Q: What is the offical language of India?
Ans : English
? The correct answer should be Hindi.

Total correct answer : 3
Total wrong answer : 3
*/