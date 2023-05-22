package books.java_programming.chapter_03.practice;

import java.util.Scanner;

public class PizzaProblem {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("> Enter total slices : ");
        int slices = input.nextInt();

        System.out.print("> Enter number of your friend(s) : ");
        int friends = input.nextInt();

        System.out.print("> How many slices each wants : ");
        int perFriendsNeed = input.nextInt();

        int needSlices = perFriendsNeed * friends;

        if(needSlices <= slices){
            System.out.println("> Yes, it's possible to split the pizza fairly.");
        }else{
            System.out.println("> Sorry, it's not possible to split the pizaa farily.");
        }

        input.close();
    }
}

/*
Sample Output 1 : 
> Enter total slices : 11
> Enter number of your friend(s) : 5
> How many slices each wants : 2
> Yes, it's possible to split the pizza fairly.

Sample Output 2 : 
> Enter total slices : 12
> Enter number of your friend(s) : 5
> How many slices each wants : 3
> Sorry, it's not possible to split the pizaa farily.

*/
