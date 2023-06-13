package problem_solving.codeforces;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int numberOfWord = input.nextInt();
        String words[] = new String[numberOfWord];

        // get words
        for(int i = 0;i < numberOfWord;i++){
            words[i] = input.next();
        }

        // print word
        for(int i = 0;i < numberOfWord;i++){
            if(words[i].length() <= 10){
                System.out.println(words[i]);
            }else{
                System.out.println("" + words[i].charAt(0)
                                      + (words[i].length()-2)
                                      + words[i].charAt(words[i].length()-1));
            }
        }

        input.close();
    }
}
