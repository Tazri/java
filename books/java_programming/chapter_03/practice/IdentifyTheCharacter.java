package practice;

import java.util.Scanner;

public class IdentifyTheCharacter {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter the character : ");
        char ch = input.next().charAt(0);
        
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("> "+ch+" character is alphabet.");
        }else if(ch >= '0' && ch <= '9'){
            System.out.println("> "+ch+" character is number.");
        }else if(ch == ' '){
            System.out.println("> "+ch+" character is space.");
        }else{
            System.out.println("> "+ ch +" character is Symbol.");
        }

        input.close();
    }
}


/*
Output Sample 1 : 
> Enter the character : 5
> 5 character is number.

Output Sample 2 : 
> Enter the character : a
> a character is alphabet.

Output Sample 3 : 
> Enter the character : " 
> " character is Symbol.
*/