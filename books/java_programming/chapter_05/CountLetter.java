import java.util.Scanner;

public class CountLetter {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter characters : ");

        String inputValue = input.nextLine();

        inputValue = inputValue.toLowerCase(); // make lower case
        char [] letters = inputValue.toCharArray(); // make character array

        int [] counts = new int[26];

        for(int i = 0;i < letters.length;i++){
            char letter = letters[i];
            if(Character.isLetter(letter)){ // check is letter
                int index = letter - 'a';
                counts[index] ++;
            }
        }

        System.out.println("> Letter count : ");
        for(int i = 0;i < counts.length;i++){
            if(counts[i] != 0){
                char letter = (char) (i+'a');
                System.out.println("> "+letter+" : "+counts[i]);
            }
        }

        input.close();
    }
}

/*
> Enter characters : Write once, run everywhere.
> Letter count : 
> c : 1
> e : 6
> h : 1
> i : 1
> n : 2
> o : 1
> r : 4
> t : 1
> u : 1
> v : 1
> w : 2
> y : 1
*/